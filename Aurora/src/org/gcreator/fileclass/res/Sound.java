/*
 * Sound.java
 * 
 * Created on 13-Sep-2007, 07:50:14
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass.res;

/**
 *
 * @author Ali1
 */
public class Sound extends Resource  {
static final long serialVersionUID = 1L;
    // String name;
    public byte[] sound;
    public String extension="";

    public Sound(String name) {
        this.name = name;
    }
    

     
    public String exportToHtml(boolean xhtml){
        return "";
    }
    
    public Object clone(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
