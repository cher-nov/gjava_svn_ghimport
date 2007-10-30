/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.gcreator.compilers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Enumeration;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.gcreator.components.ExtendedFrame;
import org.gcreator.components.TabPanel;
import org.gcreator.core.Aurwindow;
import org.gcreator.core.gcreator;
import org.gcreator.core.utilities;
import org.gcreator.fileclass.Project;
import org.gcreator.fileclass.res.Actor;
import org.gcreator.fileclass.res.Scene;
import org.gcreator.fileclass.res.Sprite;
import org.gcreator.managers.ToolbarManager;
import org.gcreator.plugins.*;
import org.gcreator.units.ActorInScene;

/**
 *
 * @author luis
 */
public class GJava extends PlatformCore {

    public static String projectname,  FileFolder;
    public static int sprites = 0,  actors = 0,  scenes = 0,  fonts = 0;
    String loadscene = "";

    public GJava() {

    }

    @Override
    public void parseSprite(Sprite s) {
        super.parseSprite(s);
    }

    @Override
    public void parseActor(Actor a) {

    }

    @Override
    public void parseClass() {

    }

    @Override
    public void parseScene(Scene s) throws IOException {
        System.out.println("Parse scene");
        loadscene += "    scenes[" + scenes + "] = new " + s.name + "();";
        scenes++;
        FileWriter sceneFW = new FileWriter(FileFolder + File.separator + s.name + ".java");
        BufferedWriter scene = new BufferedWriter(sceneFW);
        print(scene, "package org.gcreator.compilers.gjava;");
        print(scene, "");
        print(scene, "import org.gcreator.compilers.gjava.components.Scene;");
        print(scene, "import org.gcreator.compilers.gjava.core.*;");
        print(scene, "import java.awt.Color;");
        print(scene, "");
        print(scene, "public class " + s.name + " extends Scene {");
        print(scene, "");
        print(scene, "    " + s.name + "() {");
        if (s.drawbackcolor)
        print(scene, "        super(basicgame.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", new Color(" + s.background.getRed() + "," + s.background.getGreen() + "," + s.background.getBlue() +  "));");
        else
            print(scene, "        super(basicgame.frame,\"" + s.caption + "\"," + s.speed + "," + s.width + "," + s.height + ", Color.BLACK);");
        print(scene, "    }");
        print(scene, "    private void setupScene() {");
        for (Enumeration e = s.actors.elements() ; e.hasMoreElements() ;) {
           print(scene, "instances.add(new "+((ActorInScene)e.nextElement()).actor.name+"("+((ActorInScene)e.nextElement()).x+","+((ActorInScene)e.nextElement()).y+"));");
     }
        print(scene, "    }");
        print(scene, "");
        print(scene, "}");
        scene.close();
    }

    public void createFolders() {
        try {
            FileFolder = "Projects" + File.separator + projectname + File.separator + "Java" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava" + File.separator;
            File f1 = new File(FileFolder);
            f1.mkdirs();
            File f2 = new File("plugins" + File.separator + "org" + File.separator + "gcreator" + File.separator + "compilers" + File.separator + "gjava");
            copyDirectory(f2, f1);
        } catch (IOException ex) {
            System.out.println("" + ex.getLocalizedMessage());
        }
    }

    @Override
    public void onSplashDispose() {
        init();
    }

    public void init() {
        utilities.addStringMessage("Installed G-Java!");
        // add toolbar button
        JButton run = ToolbarManager.addButton(new ImageIcon(getClass().getResource("/org/gcreator/resources/toolbar/run.png")), 50);

        run.addActionListener(new ActionListener() {

                    @Override
            public void actionPerformed(ActionEvent evt) {
                        run(gcreator.window.getMainProject());
                    }
                });
        Aurwindow.tool.add(run);
    }

    public void createJavaFiles() throws IOException {
        FileWriter gameFW = new FileWriter(FileFolder + File.separator + "Game.java");
        BufferedWriter game = new BufferedWriter(gameFW);
        print(game, "package org.gcreator.compilers.gjava;");
        print(game, "import org.gcreator.compilers.gjava.components.Scene;");
        print(game, "import org.gcreator.compilers.gjava.core.basicgame;");
        print(game, "public class Game extends basicgame {");
        print(game, "    Game(){");
        print(game, "        loadScenes();");
        print(game, "        nextScene();");
        print(game, "    }");
        print(game, "   public void loadScenes(){");
        print(game, "  scenes = new Scene[" + scenes + "]; ");
        print(game, "" + loadscene);
        print(game, "    }");
        print(game, "   public static void main(String[] args){");
        print(game, "       Runningas = \"Application\";");
        print(game, "       canvas=frame;");
        print(game, "       frame.setVisible(true);");
        print(game, "       new Game();");
        print(game, "   }");
        print(game, "}");
        game.close();
    }

    public void run(Project project) {
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
        projectname = project.name;
        loadscene = "";
        scenes=0;
        if (project == null) {
            return;
        }
        utilities.addStringMessage("Building/running using G-Java");
        utilities.addStringMessage("Creating java files...");
        createFolders();
        super.run(project);
        try {
            createJavaFiles();
        } catch (Exception e) {
        }

        GJavaCompiler compiler = new GJavaCompiler();
    }
}
