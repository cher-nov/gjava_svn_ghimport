/*
 * SpriteEditor.java
 *
 * Created on 10 September 2007, 02:24
 */

package org.gcreator.editors;

import org.gcreator.components.SubimagePreview;
import org.gcreator.components.TabPanel;
import org.gcreator.components.resource.*;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Sprite;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author  Ali1
 */
public class SpriteEditor extends TabPanel {
    
    public Sprite sprite;
    boolean changed;
    private SubimagePreview prev;
    private ResourceChooser res;
    private boolean dragging = false;
    
    /** Creates new form SpriteEditor */
    public SpriteEditor(org.gcreator.fileclass.GFile file,Project project) {
        this.project = project;
        this.file = file;
        boolean dontChange = false;
        //title = file.name + "(" + project.name+")";
        //if (file.value instanceof Sprite)
        //{
        if(file.value != null){
            if(file.value instanceof String){
                Sprite spr = new Sprite();
                spr.readXml((String) file.value);
                file.value = spr;
                changed = true;
            }
            else{
                System.out.println("GOT HERE");
                this.sprite = (Sprite) ((Sprite) file.value).clone();
                changed = false;
                dontChange = true;
            }
        }
        else{
            this.sprite = (Sprite) new Sprite();
            changed = true;
        }
        Component c = org.gcreator.core.gcreator.panel.getNavigatorPanel();
        if(c instanceof JPanel){
            System.out.println("Update c JPanel");
            ((JPanel) c).updateUI();
        }
        else if(c instanceof JScrollPane){
            ((JScrollPane) c).updateUI();
            Component d = ((JScrollPane) c).getViewport().getView();
            if(d instanceof JPanel){
                System.out.println("Update d JPanel");
                ((JPanel) d).updateUI();
            }
            else if(d instanceof JEditorPane){
                System.out.println("Update d editor pane");
                ((JEditorPane) d).updateUI();
            }
            else
                d.repaint();
        }
        initComponents();
        load();
       // }
//        else
//        {
//            this.sprite = new Sprite(file.name);
//        }
        try {
            jTextField1.setText(file.name);
        }
        catch(NullPointerException e){}
        jScrollPane1.setViewportView(prev = new SubimagePreview(this));

        jPanel13.add(res = new ResourceChooser(project, "image"));
        
        jTextField1.getDocument().addDocumentListener(new DocumentListener(){
            public void changedUpdate(DocumentEvent evt){
                updateName();
            }
            public void insertUpdate(DocumentEvent evt){
                updateName();
            }
            public void removeUpdate(DocumentEvent evt){
                updateName();
            }
        });
        if(dontChange){
            System.out.println("And here");
            changed = false;
        }
    }
    
    public void updateName() {
        file.name = jTextField1.getText();
        //sprite.name = file.name;
        org.gcreator.core.gcreator.panel.workspace.updateUI();
    }
     
    public boolean canSave(){
        System.out.println("canSave: " + changed);
        return changed;
    }
    
    @Override
    public boolean Save() {
        changed = false;
        sprite.BBBottom=(Integer)jSpinner6.getValue();
        sprite.BBRight=(Integer)jSpinner5.getValue();
        sprite.BBTop=(Integer)jSpinner4.getValue();
        sprite.BBleft=(Integer)jSpinner3.getValue();
        
        sprite.originX=(Integer)jSpinner1.getValue();
        sprite.originY=(Integer)jSpinner2.getValue();
        
        sprite.precise = jCheckBox1.isSelected();
        
        file.value = sprite;
        
        return true;
    }

     
    @Override
    public boolean wasModified() {
        System.out.println("wasModified: " + changed);
        return changed;
    }
    
    public void load()
    {
        if (sprite == null)
        {
            this.sprite = new Sprite(/*file.name*/);
            return;
        }
        System.out.println("Loading");
        jSpinner1.setValue(sprite.originX);
        jSpinner2.setValue(sprite.originY);
        
        jSpinner6.setValue(sprite.BBBottom);
        jSpinner5.setValue(sprite.BBRight);
        jSpinner4.setValue(sprite.BBTop);
        jSpinner3.setValue(sprite.BBleft);
        
        jCheckBox1.setSelected(sprite.precise);
        jLabel2.setText("Width: "+sprite.width);
        jLabel3.setText("Height: "+sprite.height);
        jLabel4.setText("Subimages: "+sprite.countImages());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();

        jLabel1.setText("Name:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jScrollPane1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseReleased(evt);
            }
        });
        jScrollPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseDragged(evt);
            }
        });

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Image"));

        jPanel13.setLayout(new java.awt.BorderLayout());

        jButton2.setText(org.gcreator.managers.LangSupporter.activeLang.getEntry(133));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setText("Height:");

        jLabel2.setText("Width:");

        jLabel4.setText("Subimages:");

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/subimageright.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel5.setText("Show:");

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/gcreator/resources/subimageleft.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("0");

        jButton1.setText(org.gcreator.managers.LangSupporter.activeLang.getEntry(135));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel13, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
            .add(jButton2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .add(jLabel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 84, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                .add(4, 4, 4)
                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 71, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jTextField2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 26, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 70, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(8, 8, 8))
            .add(jPanel4Layout.createSequentialGroup()
                .add(2, 2, 2)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel4Layout.createSequentialGroup()
                        .add(jButton1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                        .add(2, 2, 2))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel5)
                            .add(jLabel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel3)
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel4)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 136, Short.MAX_VALUE)
                .add(jLabel5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jButton4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jTextField2))
                .add(12, 12, 12)
                .add(jButton1)
                .add(23, 23, 23))
        );

        jTabbedPane1.addTab("General", jPanel4);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Bounding Box"));

        jLabel8.setText("Left:");

        jLabel9.setText("Right:");

        jLabel10.setText("Top:");

        jLabel11.setText("Bottom:");

        jSpinner3.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner3StateChanged(evt);
            }
        });

        jSpinner4.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner4StateChanged(evt);
            }
        });

        jSpinner5.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner5StateChanged(evt);
            }
        });

        jSpinner6.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner6StateChanged(evt);
            }
        });

        jButton8.setText("Automatic (Strict)");

        jButton9.setText("Full Image");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton5.setText("Automatic (Standard)");

        jButton7.setText("Automatic (Custom)");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel11)
                            .add(jLabel9)
                            .add(jLabel8)
                            .add(jLabel10))
                        .add(31, 31, 31)
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jSpinner6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .add(jSpinner4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .add(jSpinner3, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                            .add(jSpinner5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)))
                    .add(jButton8, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .add(jButton5, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jButton7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                    .add(jButton9, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(jButton8)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton5)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton7)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jButton9)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel10)
                    .add(jSpinner4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel11)
                    .add(jSpinner6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel9)
                    .add(jSpinner5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel8)
                    .add(jSpinner3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
        );

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Precise collision checking");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .add(jCheckBox1))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 44, Short.MAX_VALUE)
                .add(jCheckBox1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Collision", jPanel5);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Origin"));

        jLabel6.setText("X:");

        jLabel7.setText("Y:");

        jButton6.setText("Center");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });
        jSpinner1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner1StateChanged(evt);
            }
        });
        jSpinner1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jSpinner1KeyTyped(evt);
            }
        });

        jSpinner2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner2MouseClicked(evt);
            }
        });
        jSpinner2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jSpinner2StateChanged(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 46, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jButton6)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 18, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jSpinner2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel6)
                    .add(jSpinner2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel7)
                    .add(jSpinner1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jButton6))
        );

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(285, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Other", jPanel6);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 111, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 211, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 422, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 17, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 20, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jTabbedPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        file.name = jTextField1.getText();
        org.gcreator.core.gcreator.panel.workspace.updateUI();
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked
      changed=true;
      System.out.println("1");
    }//GEN-LAST:event_jSpinner1MouseClicked

    private void jSpinner1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jSpinner1KeyTyped
        changed=true;
        System.out.println("2");
    }//GEN-LAST:event_jSpinner1KeyTyped

    private void jSpinner2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner2MouseClicked
        changed=true;
        System.out.println("3");
    }//GEN-LAST:event_jSpinner2MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        changed=true;
        sprite.precise = jCheckBox1.isSelected();
        System.out.println("4");
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jSpinner1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner1StateChanged
        changed=true;
        sprite.originX = (Integer) jSpinner1.getValue();
        jScrollPane1.updateUI();
        System.out.println("6");
    }//GEN-LAST:event_jSpinner1StateChanged

    private void jSpinner2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner2StateChanged
        changed=true;
        sprite.originY = (Integer) jSpinner2.getValue();
        jScrollPane1.updateUI();
        System.out.println("7");
    }//GEN-LAST:event_jSpinner2StateChanged

    private void jSpinner4StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner4StateChanged
        changed=true;
        sprite.BBTop = (Integer) jSpinner4.getValue();
        jScrollPane1.updateUI();
        System.out.println("8");
    }//GEN-LAST:event_jSpinner4StateChanged

    private void jSpinner6StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner6StateChanged
        changed=true;
        sprite.BBBottom = (Integer) jSpinner6.getValue();
        jScrollPane1.updateUI();
        System.out.println("9");
    }//GEN-LAST:event_jSpinner6StateChanged

    private void jSpinner5StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner5StateChanged
        changed=true;
        sprite.BBRight = (Integer) jSpinner5.getValue();
        jScrollPane1.updateUI();
        System.out.println("10");
    }//GEN-LAST:event_jSpinner5StateChanged

    private void jSpinner3StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jSpinner3StateChanged
        changed=true;
        sprite.BBleft = (Integer) jSpinner3.getValue();
        jScrollPane1.updateUI();
        System.out.println("11");
    }//GEN-LAST:event_jSpinner3StateChanged

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        changed=true;
        jSpinner1.setValue(sprite.width / 2);
        jSpinner2.setValue(sprite.height / 2);
        sprite.originX = (Integer) jSpinner1.getValue();
        sprite.originY = (Integer) jSpinner2.getValue();
        System.out.println("12");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        changed=true;
        jSpinner3.setValue(sprite.width-1);//left
        jSpinner4.setValue(0);//top
        jSpinner5.setValue(0);//right
        jSpinner6.setValue(sprite.height-1);//bottom
        sprite.BBleft = (Integer) jSpinner3.getValue();
        sprite.BBTop = (Integer) jSpinner4.getValue();
        sprite.BBRight = (Integer) jSpinner5.getValue();
        sprite.BBBottom = (Integer) jSpinner6.getValue();
        System.out.println("13");
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        changed = true;
        org.gcreator.fileclass.GFile a = (org.gcreator.fileclass.GFile) res.getFile();
        Object o = a.value;
        if (sprite.countImages()  == 0){
            if(o!=null&&((org.gcreator.fileclass.res.GImage) o).image != null){
            sprite.width = ((org.gcreator.fileclass.res.GImage) o).image.getIconWidth();
            sprite.height = ((org.gcreator.fileclass.res.GImage) o).image.getIconHeight();
            jLabel2.setText("Width:"+sprite.width);
            jLabel3.setText("Height:"+sprite.height);
            }
            else{
                sprite.width = 0;
                sprite.height = 0;
            }
            jButton9ActionPerformed(evt);
        }
        
        if (((org.gcreator.fileclass.res.GImage) o)!=null&&(sprite.width == ((org.gcreator.fileclass.res.GImage) o).image.getIconWidth()) && sprite.height == ((org.gcreator.fileclass.res.GImage) o).image.getIconHeight() )
            sprite.addToList(res.getFile());
        else
            System.out.println("Image not right size!");
        jLabel4.setText("Subimages:"+sprite.countImages());
        jScrollPane1.updateUI();
        System.out.println("14");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        changed = true;
        int id = getViewedId();
        sprite.Simages.remove(id);
        if(id >= sprite.countImages())
            id = 0;
        jLabel4.setText("Subimages: " + sprite.countImages());
        setViewedId(id);
        System.out.println("15");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int id = getViewedId() + 1;
        if(id >= sprite.countImages())
            id = 0;
        setViewedId(id);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int id = getViewedId() - 1;
        if(id < 0)
            id = Math.max(0, sprite.countImages()-1);
        setViewedId(id);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jScrollPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseDragged
        changed = true;
        if (!dragging)
            return;
        int x,y;
        x = evt.getX()-2;
        y = evt.getY()-2;
        sprite.originX = x;
        sprite.originY = y;
        jSpinner1.setValue(x);
        jSpinner2.setValue(y);
        prev.repaint();     
        System.out.println("16");
    }//GEN-LAST:event_jScrollPane1MouseDragged

    private void jScrollPane1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MousePressed
        changed = true;
        if (evt.getX() > sprite.width || evt.getY() > sprite.height)
            return;
        dragging = true;
        jScrollPane1MouseDragged(evt);
        System.out.println("17");
    }//GEN-LAST:event_jScrollPane1MousePressed

    private void jScrollPane1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseReleased
        changed = true;
        dragging = false;
        System.out.println("18");
    }//GEN-LAST:event_jScrollPane1MouseReleased

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
            setAutomaticBounds();//GEN-LAST:event_jButton8ActionPerformed
    }                                        
    
    public int getViewedId(){
        try{
            return Integer.parseInt(jTextField2.getText());
        }
        catch(Throwable t){
            return -1;
        }
    }
    
    public void setViewedId(int id){
        jTextField2.setText("" + id);
        jScrollPane1.updateUI();
    }
    
    public ImageIcon getImageAt(int id){
        //if(id<sprite.countImages())
        //    return null;
        return sprite.getImageAt(id);
    }
    
    public ImageIcon getCurrentImage(){
        return getImageAt(getViewedId());
    }
    
    private void setAutomaticBounds() {
        changed = true;
        //
        // Not yet finished
        //
        //Image img;
        //try {
        //    img = sprite.getImageAt(0).getImage();
        //} catch (NullPointerException e) {
        //    System.out.println("NullPointerException!");
        //    return;
        //}
        //BufferedImage bufImg = new BufferedImage(sprite.width,sprite.height,BufferedImage.TYPE_4BYTE_ABGR);
        //Graphics g = bufImg.createGraphics();
        //g.setPaintMode();
        //g.drawImage(img,0,0,this);
       /* 
        for (int i = 0; i < sprite.width; i++)
            for (int j = 0; j < sprite.height; j++) {
                int RGBA = bufImg.getRGB(i, j);
                Color col = new Color(RGBA,true);
        }
        */
        System.out.println("19");
        
    } 
    
    // <editor-fold defaultstate="collapsed" desc="Gnerated Variables"> 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner jSpinner1;
    public javax.swing.JSpinner jSpinner2;
    public javax.swing.JSpinner jSpinner3;
    public javax.swing.JSpinner jSpinner4;
    public javax.swing.JSpinner jSpinner5;
    public javax.swing.JSpinner jSpinner6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
   // </editor-fold>
}
