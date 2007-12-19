/*
 * G-C# plugin
 */
package org.gcreator.compilers.GCS.plugin;

import org.gcreator.core.*;
import org.gcreator.plugins.*;
import org.gcreator.managers.*;
import javax.swing.*;
import java.awt.event.*;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.*;
import java.io.*;
import java.awt.image.*;
import sun.awt.image.*;
import javax.imageio.*;
import org.gcreator.components.*;
import java.util.*;
import org.gcreator.units.ActorInScene;

/**
 *
 * @author Luís
 */
public class GCSharp extends PlatformCore {

    public GCSOptions settings;
    public static String projectname,  FileFolder;
    public static Vector<String> files = new Vector<String>(),  scenelist = new Vector<String>();

    public void parseImage(ImageIcon i, org.gcreator.fileclass.File f) {

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            BufferedImage ii;
            if ((i.getImage()) instanceof ToolkitImage) {
                System.out.println("Toolkit");
                ii = ((ToolkitImage) (i.getImage())).getBufferedImage();
            } else {
                ii = (BufferedImage) i.getImage();
            }
            ImageIO.write(ii, f.type, baos);

            File tff = new File(FileFolder + "graphics");
            //
            tff.mkdirs();
            File ff = new File(FileFolder + "graphics" + File.separator + f.name + "." + f.type);
            FileOutputStream fos = new FileOutputStream(ff);

            fos.write(baos.toByteArray());
            fos.close();
        } catch (Exception e) {
            System.out.println("Exception parsing image" + e.getMessage());
        }
    }

    public void parseSprite(Sprite s) {
        super.parseSprite(s);
        files.add(s.name+".cs");
        try {
            FileWriter spr = new FileWriter(FileFolder + s.name + ".cs");
            BufferedWriter w = new BufferedWriter(spr);
            System.out.println("Go " + w.toString());
            print(w, "/*Automatically generated by G-C#*/");
            print(w, "");
            print(w, "using org.gcreator.Components;");
            print(w, "using org.gcreator.Support;");
            print(w, "");
            print(w, "public class " + s.name + " : Sprite");
            print(w, "{");
            print(w, "\tpublic " + s.name + "()");
            print(w, "\t{");
            print(w, "\t\tsetOrigin(" + s.originX + ", " + s.originY + ");");
            print(w, "\t\tsetImageArray(new Image[]");
            print(w, "\t\t{");
            for (int i = 0; i < s.countImages(); i++) {
                if (i != s.countImages() - 1) {
                    print(w, "\t\t\tnew Image(\"./graphics/" + s.getAt(i).name + "." + s.getAt(i).type + "\"),");
                } else {
                    print(w, "\t\t\tnew Image(\"./graphics/" + s.getAt(i).name + "." + s.getAt(i).type + "\")");
                }
            }
            print(w, "\t\t});");
            print(w, "\t\tsetBounds(new Rectangle(" + s.BBleft + ", " + s.BBTop + ", " + (s.BBRight - s.width) + ", " + (s.BBBottom - s.height) + "));");
            print(w, "\t}");
            print(w, "}");
            w.close();
        } catch (IOException e) {
            System.out.println("" + e.getLocalizedMessage());
        }
    }

    public void parseActor(Actor a) {
        files.add(a.name + ".cs");
        try {
            FileWriter actorFW = new FileWriter(FileFolder + a.name + ".cs");
            BufferedWriter actor = new BufferedWriter(actorFW);
            print(actor, "using org.gcreator.Components;");
            print(actor, "using org.gcreator.Support;");
            print(actor, "");
            print(actor, "public class " + a.name + " : Actor");
            print(actor, "{");
            print(actor, "\tpublic " + a.name + "(int x, int y) : base(x,y," + a.depth + ")");
            print(actor, "\t{");
            print(actor, "\t\tsetSprite(new " + a.sprite + "());");
            print(actor, "\t}");
            print(actor, "");
            //events
            for (Enumeration e = a.events.elements(); e.hasMoreElements();) {
                    org.gcreator.events.Event evt = (org.gcreator.events.Event) e.nextElement();
                    if(evt instanceof org.gcreator.events.BeginStepEvent){
                        print(actor, "\tpublic override void BeginStep()");
                    }
                    if(evt instanceof org.gcreator.events.StepEvent){
                        print(actor, "\tpublic override void Step()");
                    }
                    if(evt instanceof org.gcreator.events.EndStepEvent){
                        print(actor, "\tpublic override void End()");
                    }
                    if(evt instanceof org.gcreator.events.DrawEvent){
                        print(actor, "\tpublic override void Draw()");
                    }
                    print(actor, "\t{");
                    print(actor, "\t}");
                    print(actor, "");
            }
            print(actor, "}");
            actor.close();
        } catch (Exception e) {
        }

    }

    public void parseClass(String s, String name){
        files.add(name+".cs");
        try{
            FileWriter scriptFW = new FileWriter(FileFolder + name + ".cs");
            BufferedWriter script = new BufferedWriter(scriptFW);
            print(script, "using org.gcreator.Components;");
            print(script, "using org.gcreator.Support;");
            print(script, "using org.gcreator.Scripting;");
            super.parseGCLClass(s, this);
        }
        catch(Exception e){}
    }
    
    public void parseScene(Scene s) throws IOException {
        files.add(s.name + ".cs");
        FileWriter sceneFW = new FileWriter(FileFolder + s.name + ".cs");
        BufferedWriter scene = new BufferedWriter(sceneFW);
        print(scene, "using org.gcreator.Components;");
        print(scene, "using org.gcreator.Support;");
        print(scene, "");
        print(scene, "public class " + s.name + " : Scene");
        print(scene, "{");
        print(scene, "\tpublic " + s.name + "()");
        print(scene, "\t{");
        for (Enumeration<ActorInScene> e = s.actors.elements(); e.hasMoreElements();) {
            ActorInScene ais = e.nextElement();
            print(scene, "\t\taddActor(new " + ais.Sactor + "(" + ais.x + ", " + ais.y + "));");
        }
        print(scene, "\t}");
        print(scene, "}");
        scene.close();
    }
    
    public void createFolders() {
        try {
            FileFolder = getClass().getProtectionDomain().getCodeSource().getLocation().toString() + File.separator + "Projects" + File.separator + projectname + File.separator + "CSharp";
            File f1 = new File(FileFolder);
            FileFolder = FileFolder.replaceAll("file:", "").replaceAll("\\./plugins/", "").replaceAll("//+", "/");
            FileFolder += "/";
            if (f1.exists()) {
                f1.delete();
            }
            copyDirectory(new File(getClass().getProtectionDomain().getCodeSource().getLocation().toString().replaceAll("\\./", "").replaceAll("//+", "/").replaceAll("file:", "") + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "GCS" + File.separator + "require"), new File(FileFolder));
            f1.mkdirs();
        } catch (IOException ex) {
            System.out.println("" + ex.getLocalizedMessage());
        }
    }

    public GCSharp() {
        VarsRegistry.setVariable("gcs.version", "draft");
        settings = new GCSOptions();
    }

    public void createSharpFiles(Project p) throws IOException {
        files.add("Game.cs");
        FileWriter gameFW = new FileWriter(FileFolder + "Game.cs");
        BufferedWriter game = new BufferedWriter(gameFW);
        print(game, "/*Automatically generated by G-C#*/");
        print(game, "");
        print(game, "using org.gcreator.Components;");
        print(game, "using org.gcreator.Native;");
        print(game, "");
        print(game, "public class Application");
        print(game, "{");
        print(game, "\tprivate static Scene[] scenelist = new Scene[]");
        print(game, "\t{");
        int i = p.findFromName("Settings");
        if (i > 0) {
            org.gcreator.fileclass.Object ff = p.childAt(i);
            if (ff != null && ff instanceof org.gcreator.fileclass.File) {
                org.gcreator.fileclass.File f = (org.gcreator.fileclass.File) ff;
                if (f.value != null && f.value instanceof org.gcreator.fileclass.res.SettingsValues) {
                    org.gcreator.fileclass.res.SettingsValues s = (org.gcreator.fileclass.res.SettingsValues) f.value;
                    org.gcreator.fileclass.res.TabValues Scenes = s.getValue("Scene Order");
                    Vector v = (Vector) Scenes.getValue("Scenes");
                    for (Enumeration t = v.elements(); t.hasMoreElements();) {
                        org.gcreator.fileclass.File o = (org.gcreator.fileclass.File) t.nextElement();
                        print(game, "new " + o.name + "()" + (t.hasMoreElements() ? "," : ""));
                    }
                }
            }
        }
        print(game, "\t};");
        print(game, "");
        print(game, "\tpublic static void Main(string[] args)");
        print(game, "\t{");
        print(game, "\t\tSDL.Game game = new SDL.Game(scenelist, false, true, 800, 600, \"G-C# Application\");");
        print(game, "\t\tgame.Run();");
        print(game, "\t}");
        print(game, "}");
        game.close();
    }

    public void run(Project p) {
        System.out.println("Saving...");
        if (gcreator.window.istabs) {
            for (int ii = 0; ii < gcreator.window.tabs.getTabCount(); ii++) {
                if (((TabPanel) gcreator.window.tabs.getComponentAt(ii)).project == null) {
                } else if (((TabPanel) gcreator.window.tabs.getComponentAt(ii)).project.equals(Aurwindow.getMainProject()) && ((TabPanel) gcreator.window.tabs.getComponentAt(ii)).wasModified()) {
                    ((TabPanel) gcreator.window.tabs.getComponentAt(ii)).Save();
                }
            }
        } else {
            for (int ii = 0; ii < gcreator.window.mdi.getComponentCount(); ii++) {
                if (((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().project == null) {
                } else if (((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().project.equals(Aurwindow.getMainProject()) && ((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().wasModified()) {
                    ((ExtendedFrame) gcreator.window.mdi.getComponent(ii)).getPanel().Save();
                }
            }
        }
        projectname = p.name;
        PluginHelper.println("Building/running using G-C#");
        createFolders();
        files.clear();
        super.run(p);
        try {
            createSharpFiles(p);
        } catch (Exception e) {
        }

        GCSCompiler compiler = new GCSCompiler();
    }

    @Override
    public void onSplashDispose() {
        PluginHelper.println("Installed G-C#");
        PluginHelper.addGlobalTab("G-C#", settings);
        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);
        run.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        run(Aurwindow.getMainProject());
                    }
                });
        JMenuItem i = new JMenuItem("Compile with G-C#");
        i.addActionListener(new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        run(Aurwindow.getMainProject());
                    }
                });

        PluginHelper.addMenuItem(3, i);
        Aurwindow.tool.add(run);
    }

    public Object onSignalReceived(PluginCore caller, Object signal) {
        if (signal instanceof Object[]) {
            Object[] args = (Object[]) signal;
            if (args[0] instanceof String && ((String) args[0]).equals("compile")) {
                for (int i = 1; i < args.length; i++) {
                    if (args[i] != null && args[i] instanceof Project) {
                        run((Project) args[i]);
                    }
                }
                return true;
            }
        }
        return false;
    }

    public String getID() {
        return "G-C#";
    }
}
