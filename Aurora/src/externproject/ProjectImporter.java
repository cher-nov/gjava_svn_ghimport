/*
 * ProjectImporter.java
 * 
 * Created on 5/Set/2007, 13:24:52
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package externproject;

import core.*;

import javax.swing.*;
import components.*;
import fileclass.*;

import java.awt.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipException;
import java.util.zip.ZipInputStream;
import managers.ProjectTree;

/**
 *
 * @author Luís
 */
public class ProjectImporter {
   static String name;
   static int type;
   static Project project;
   
   public static void readFile(String s,String name)
   {
       
   }
   
    public static void readConfig(String s)
    {
        fileclass.Folder f = new fileclass.Folder("");
        System.out.println("reading config file...");
        
        System.out.println(s);
        
        if (s.split(">")[3].equals("Game")) type = 0;
        if (s.split(">")[3].equals("Package")) type = 1;
        if (s.split(">")[3].equals("Extension")) type = 2;
        if (type == 0){
                project = new GameProject(name, "");
        }
        if (type == 1){
                project = new PackageProject(name, "");
        }
        if (type == 2){
                project = new ExtensionProject(name, "");
        }
        Aurwindow.setMainProject(project);
        String[] ss = s.split("<file type=\"");
        int ii=1;
        while(ii < ss.length){
         String[] sss = ss[ii].replaceAll("</file>", "").split("\">");  //SpriteGroup">Sprites
         if(sss[0].equals("SpriteGroup"))

         {
             f = new SpriteGroup(project, "Sprites");
             project.add(f);
         }
         else if(sss[0].equals("SoundGroup"))
         {
             f = new SpriteGroup(project, "Sounds");
             project.add(f);
         }
         else if(sss[0].equals("ActorGroup"))
         {
             f = new SpriteGroup(project, "Actors");
             project.add(f);
         }
         else  if(sss[0].equals("SceneGroup"))
         {
             f = new SpriteGroup(project, "Scenes");
             project.add(f);
         }
         else if(sss[0].equals("EGMLGroup"))
         {
             f = new SpriteGroup(project, "Classes");
             project.add(f);
         }
         else if(sss[0].equals("Group"))
         {
             Folder ff = new Group(project, "Group");
             f.add(ff);
         }
         else if(sss[0].equals("File"))
         {
             String ssss[] = sss[1].split("\\.");
             System.out.println(""+ssss.length);
             if(ssss.length >0){
             fileclass.File file = new fileclass.File(f, ssss[0], ssss[1], null);
             
           // f.add(file);
             }
         }
         

             project.add(new SpriteGroup(project, sss[1]));
         if(sss[0].equals("ActorGroup"))
             project.add(new ActorGroup(project, sss[1]));
         if(sss[0].equals("CppGroup"))
             project.add(new CppGroup(project, sss[1]));
         if(sss[0].equals("CppRefGroup"))
             project.add(new CppRefGroup(project, sss[1]));
         if(sss[0].equals("EGMLGroup"))
             project.add(new EGMLGroup(project, sss[1]));
         if(sss[0].equals("ImageGroup"))
             project.add(new ImageGroup(project, sss[1]));
         if(sss[0].equals("JavaGroup"))
             project.add(new JavaGroup(project, sss[1]));
         if(sss[0].equals("JavaRefGroup"))
             project.add(new JavaRefGroup(project, sss[1]));
         if(sss[0].equals("SceneGroup"))
             project.add(new SceneGroup(project, sss[1]));
         if(sss[0].equals("SoundGroup"))
             project.add(new SoundGroup(project, sss[1]));
         if(sss[0].equals("SpriteGroup"))
             project.add(new SpriteGroup(project, sss[1]));
         if(sss[0].equals("StaticGroup"))
             project.add(new StaticGroup(project, sss[1]));
         if(sss[0].equals("Group"))
             project.add(new Group(project, sss[1]));

        ii++;
        }
        if(project!=null)
                    ProjectTree.importFolderToTree(project, core.aurora.window.top);
        Aurwindow.workspace.updateUI();
    }
    
    public static void OpenProject(Component caller) {
        try {
            //open project
            JFileChooser fc = new JFileChooser();
            fc.setFileFilter(new CustomFileFilter(".gcp", "G-Creator Project File"));
            fc.showOpenDialog(caller);
            java.io.File file = fc.getSelectedFile();
            if (file == null) {
                return;
            }
            
            ZipInputStream in = new ZipInputStream(new FileInputStream(file));
            ZipEntry zipe;
            byte[] b = new byte[1024];
            while( (zipe = in.getNextEntry()) != null ){
                System.out.println(""+zipe.getName());
                if(!zipe.isDirectory())
                {
                   ByteArrayOutputStream stream = new ByteArrayOutputStream(); 
                 int len;
      while ( (len = in.read(b)) > 0) {
          stream.write(b, 0, len);
      }
                                
                if (zipe.getName().equals("config"))
                    readConfig(stream+"");
                 else
                    readFile(stream+"",zipe.getName());
                }
           
            }
       
        } catch (ZipException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Aurwindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
