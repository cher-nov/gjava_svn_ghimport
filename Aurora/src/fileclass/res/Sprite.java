/*
 * Sprite.java
 * 
 * Created on 13-Sep-2007, 07:50:32
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fileclass.res;

/**
 *
 * @author Ali1
 */
public class Sprite extends Resource {
public String images[];
public int width,height,originX,originY,BBleft,BBRight,BBTop,BBBottom;
public String name;
public Sprite(String name)
{
    this.name =name;
}

    @Override
    public String writeXml() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void readXml() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
