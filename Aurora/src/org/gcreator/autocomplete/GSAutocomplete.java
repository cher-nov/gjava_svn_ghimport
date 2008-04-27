/**
 *
 * Copyright (C) 2008 Luís Reis <luiscubal@gmail.com>
 *
 * This file is part of G-Creator.
 * G-Creator is free software and comes with ABSOLUTELY NO WARRANTY.
 * See LICENSE for more details.
 */

package org.gcreator.autocomplete;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;
import javax.swing.*;
import org.gcreator.autocomplete.impl.*;
import org.gcreator.components.*;
import org.gcreator.components.impl.VectorListModel;
import org.gcreator.fileclass.Project;
import org.gcreator.units.ObjectNode;
import publicdomain.*;

/**
 * @author Luís Reis
 */
public class GSAutocomplete extends AutocompleteFrame{
    int selstart;
    int selend;
    SyntaxHighlighter editor;
    String prevWord;
    String context;
    JList list;
    JScrollPane scroll;
    boolean requestDie = false;
    Project p;
    //How to declare an actor?
    Vector<Suggestion> v = new Vector<Suggestion>();
    
    public GSAutocomplete(final int selstart, final int selend, final SyntaxHighlighter editor, Project p){
        super();
        this.selstart = selstart;
        this.selend = selend;
        this.editor = editor;
        this.p = p;
        setLayout(new BorderLayout());
        JLabel label = new JLabel("GCL Autocomplete...");
        label.setFocusable(false);
        label.setVisible(true);
        add(BorderLayout.NORTH, label);
        context = getContext();
        setTitle("GCL Autocomplete...");
        addKeyListener(new KeyListener(){
            public void keyPressed(KeyEvent evt){
                if(evt.getKeyCode()==KeyEvent.VK_DOWN){
                    if(!list.isSelectionEmpty()){
                        int sh = list.getCellRenderer().getListCellRendererComponent(
                                list, list.getSelectedValue(), list.getSelectedIndex(), false, false).getPreferredSize().height;
                        JScrollBar bar = scroll.getVerticalScrollBar();
                        bar.setValue(bar.getValue()+sh);
                    }
                    list.setSelectedIndex(list.getSelectedIndex()+1);
                }
                else if(evt.getKeyCode()==KeyEvent.VK_UP){
                    if(!list.isSelectionEmpty()){
                        int sh = list.getCellRenderer().getListCellRendererComponent(
                                list, list.getSelectedValue(), list.getSelectedIndex(), false, false).getPreferredSize().height;
                        JScrollBar bar = scroll.getVerticalScrollBar();
                        bar.setValue(bar.getValue()-sh);
                    }
                    list.setSelectedIndex(list.getSelectedIndex()-1);
                }
                else if(evt.getKeyCode()==KeyEvent.VK_LEFT){
                    editor.setSelectionStart(selstart-1);
                    editor.setSelectionEnd(selstart-1);
                    dispose();
                }
                else if(evt.getKeyCode()==KeyEvent.VK_RIGHT){
                    editor.setSelectionStart(selend+1);
                    editor.setSelectionEnd(selend+1);
                    dispose();
                }
                else if(evt.getKeyCode()==KeyEvent.VK_ENTER){
                    confirm();
                }
                else if(evt.getKeyChar()!=65535
                        &&evt.getKeyChar()!=8){
                    System.out.println((int) evt.getKeyChar());
                    editor.insert(selstart, selend, "" + evt.getKeyChar());
                    editor.setSelectionStart(selstart+1);
                    editor.setSelectionEnd(selstart+1);
                    dispose();
                    editor.callAutocomplete();
                }
                else if(evt.getKeyChar()==8){
                    if(selstart==selend){
                        editor.insert(selstart-1, selstart, "");
                    }
                    else{
                        editor.insert(selstart, selend, "");
                    }
                    dispose();
                    editor.callAutocomplete();
                    editor.setSelectionEnd(selstart);
                }
            }
            public void keyReleased(KeyEvent evt){}
            public void keyTyped(KeyEvent evt){}
        });
        useContext();
    }
    
    @Override
    public boolean requestDie(){
        return requestDie;
    }
    
    private void confirm(){
        if(list.isSelectionEmpty()){
            editor.insert(selstart, selend, "\n");
        }
        else{
            Suggestion s = (Suggestion) list.getSelectedValue();
            String t = s.confirm(context, prevWord);
            editor.insert(selstart, selend, t);
            editor.setSelectionStart(selstart+t.length()-s.retreat());
            editor.setSelectionEnd(selstart+t.length()-s.retreat());
        }
        dispose();
    }
    
    private void applyClass(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new ClassSuggestion(val));
        }
    }
    
    private void applyClassVector(Vector<String> vals){
        for(String s : vals)
            applyClass(s);
    }
    
    private void applyKeyword(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new KeywordSuggestion(val));
        }
    }
    
    private void applyCKeyword(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new CKeywordSuggestion(val));
        }
    }
    
    private void applyVKeyword(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new VKeywordSuggestion(val));
        }
    }
    
    private void applyNKeyword(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new NKeywordSuggestion(val));
        }
    }
    
    private void applyFunction(String val){
        String res = "";
        for(int i = val.length()-1; i >= 0; i--){
            if(i==val.length()-1){
                res = "(" + val.charAt(i) + ")?";
            }
            else{
                res = "(" + val.charAt(i) + res + ")?";
            }
        }
        res = "^" + res + "$";
        if(context.matches(res)){
            v.add(new FunctionSuggestion(val));
        }
    }
    
    private void useContext(){
        scroll = new JScrollPane();
        scroll.setFocusable(false);
        scroll.setVisible(true);
        list = new JList();
        list.setFocusable(false);
        list.setVisible(true);
        scroll.setViewportView(list);
        add(BorderLayout.CENTER, scroll);
        if(context==null){
            dispose();
            return;
        }
        
        applyCKeyword("if");
        applyCKeyword("while");
        applyCKeyword("for");
        applyKeyword("else");
        applyKeyword("do");
        
        applyKeyword("var");
        
        applyFunction("room_goto_next");
        applyFunction("show_message");
        
        Collections.sort(v);
        
        list.setModel(new VectorListModel(v));
        list.setCellRenderer(new SuggestionCellRenderer());
        
        if(v.size()==1){
            list.setSelectedIndex(0);
            String t = ((Suggestion) list.getSelectedValue()).confirm(context, prevWord);
            editor.insert(selstart, selend, t);
            editor.setSelectionStart(selstart+t.length());
            editor.setSelectionEnd(selstart+t.length());
            dispose();
            requestDie = true;
        }
    }
    
    private String getContext(){
        final int NULL = 0;
        final int SCOMMENT = 1;
        final int MCOMMENT = 2;
        final int STRING = 3;
        final int BSTRING = 4;
        final int CHAR = 5;
        final int BCHAR = 6;
        int situation = NULL;
        String word = "";
        String x = editor.getText();
        int selection = selend;
        prevWord = "";
        if(selection<0||selection>x.length())
            return null;
        for(int i = 0; i < selection; i++){
            try{
                if(situation==NULL){
                    if(x.charAt(i)=='/'&&x.charAt(i+1)=='/'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = SCOMMENT;
                        continue;
                    }
                    if(x.charAt(i)=='/'&&x.charAt(i+1)=='*'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = MCOMMENT;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = STRING;
                        continue;
                    }
                    if(x.charAt(i)=='\''){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        situation = CHAR;
                        continue;
                    }
                    if(x.charAt(i)==' '||x.charAt(i)=='\t'
                            ||x.charAt(i)=='\n'
                            ||x.charAt(i)=='+'
                            ||x.charAt(i)=='-'
                            ||x.charAt(i)=='*'
                            ||x.charAt(i)=='/'
                            ||x.charAt(i)=='%'
                            ||x.charAt(i)=='&'
                            ||x.charAt(i)=='|'
                            ||x.charAt(i)=='('
                            ||x.charAt(i)==')'
                            ||x.charAt(i)=='{'
                            ||x.charAt(i)=='}'
                            ||x.charAt(i)=='!'
                            ||x.charAt(i)=='^'
                            ||x.charAt(i)==','
                            ||x.charAt(i)==';'
                            ||x.charAt(i)=='<'
                            ||x.charAt(i)=='>'
                            ||x.charAt(i)=='='
                            ||x.charAt(i)=='?'
                            ||x.charAt(i)==':'){
                        if(!word.equals(""))
                            prevWord = word;
                        word = "";
                        continue;
                    }
                    word += x.charAt(i);
                    continue;
                }
                if(situation==SCOMMENT){
                    if(x.charAt(i)=='\n'){
                        situation = NULL;
                        continue;
                    }
                }
                if(situation==MCOMMENT){
                    if(x.charAt(i)=='*'&&x.charAt(i+1)=='/'){
                        situation = NULL;
                        
            continue;
                    }
                }
                if(situation==STRING){
                    if(x.charAt(i)=='\\'){
                        situation = BSTRING;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        situation = NULL;
                        continue;
                    }
                }
                if(situation==BSTRING){
                    situation = STRING;
                    continue;
                }
                if(situation==CHAR){
                    if(x.charAt(i)=='\\'){
                        situation = BCHAR;
                        continue;
                    }
                    if(x.charAt(i)=='"'){
                        situation = NULL;
                        continue;
                    }
                }
                if(situation==BCHAR){
                    situation = CHAR;
                    continue;
                }
            }
            catch(Exception e){
                break;
            }
        }
        if(situation==NULL){
            return word;
        }
        return null;
    }
    
}