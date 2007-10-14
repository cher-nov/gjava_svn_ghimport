/*
 * File.java
 * 
 * Created on 4/Set/2007, 20:12:37
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.fileclass;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Iterator;
import java.util.zip.*;
import javax.swing.ImageIcon;
import javax.imageio.*;
import javax.imageio.stream.ImageOutputStreamImpl;
import org.gcreator.fileclass.res.*;

/**
 *
 * @author Luís
 */
public class File extends Object{
    public Folder root;
    public String type; //If file is "a.txt", leave only "txt" here
    public java.lang.Object value;
    public ImageIcon treeimage;
    
    public File(Folder root, String name, String type, Object value){
        super(name);
        this.root = root;
        this.type = type;
        this.value = value;
        root.add(this);
    }
    
    private File(String name, String type){
        super(name);
        this.type = type;
    }
    
    @Override
    public String getObjectType(){
        return "File";
    }
    
    private class MyOutputStream extends ImageOutputStreamImpl{
                public ZipOutputStream out;
                public MyOutputStream(ZipOutputStream out){
                    this.out = out;
                }
                public void write(byte[] barray, int a, int b) throws IOException{
                    for(int i = a; i < b; i++)
                        out.write(barray[i]);
                }
                public void write(int a) throws IOException{
                    out.write((byte) a);
                }
                public int read(byte[] barray, int a, int b){
                    return 0;
                }
                public int read(int a){
                    return 0;
                }
                public int read(){
                    return 0;
                }
            }
    
    public void writeToBuffer(ZipOutputStream out) throws IOException{
        if(value instanceof String)
            out.write(value.toString().getBytes());
        else if(value instanceof ImageIcon){
            ImageIcon img = (ImageIcon) value;
            Iterator iter = ImageIO.getImageWritersByFormatName(type);
            MyOutputStream stream = new MyOutputStream(out);
            //HELP!!! How do you convert an ImageIcon to BufferedImage?
            //ImageIO.write(new BufferedImage img, type, stream);
        }
        else if(value instanceof org.gcreator.fileclass.res.Resource)
            out.write(((org.gcreator.fileclass.res.Resource) value).writeXml().getBytes());
    }
    
     public static ImageIcon getScaledIcon(ImageIcon ii)
		{
        ImageIcon iii = new ImageIcon();
		if (ii!=null)
			{
                    Image i = ii.getImage();
			int w = i.getWidth(null);
			int h = i.getHeight(null);

			int m;
			
				m = Math.min(w,h); //Needs clipping
			//if (m > 16) i = i.getScaledInstance(w * 16 / m,h * 16 / m,BufferedImage.SCALE_SMOOTH);
			i = i.getScaledInstance(16,16,Image.SCALE_DEFAULT);
                        // Crop and/or center the image
//			Image i2 = new BufferedImage(16,16,BufferedImage.TYPE_INT_ARGB);
//			int x = 0;
//			int y = 0;
//			if (w < 16) x = 8 - w / 2;
//			if (h < 16) y = 8 - h / 2;
//			i2.getGraphics().drawImage(i,x,y,null);
//			//i = i2;
                        iii.setImage(i);
                        return iii;
			}
		else
			{
			//i = i.getScaledInstance(16,16,Image.SCALE_DEFAULT); //scale to 16x16 only
			}

		return null;
		}
   
    
    public Object clone(){
        File o = new File(name, type);
        if(value instanceof Resource)
            o.value = ((Resource) value).clone();
        else if(value instanceof ImageIcon)
            o.value = value;
        else
            o.value = value;
        return o;
    }
}
