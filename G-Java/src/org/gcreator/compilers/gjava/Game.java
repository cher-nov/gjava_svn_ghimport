package org.gcreator.compilers.gjava;
import com.golden.gamedev.GameLoader;
import com.golden.gamedev.OpenGLGameLoader;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import org.gcreator.compilers.gjava.api.*;
import org.gcreator.compilers.gjava.api.BinaryFile;
import org.gcreator.compilers.gjava.api.components.*;
import org.gcreator.compilers.gjava.gtge.Scene2D;
import org.gcreator.compilers.gjava.lwjgl.*;
//import org.gcreator.compilers.gjava.core.basicgame;

public class Game extends org.gcreator.compilers.gjava.gtge.Basicgame {
public static Sprite G_Creator_NULL_SPRITE, sprite1;
    Game(){
      

        
    }
    
   public void loadScenes(){
  scenes = new Scene2D[1]; 
    scenes[0] = new newScene1();
    }
public void loadSprites() {
    BufferedImage[] b = {getImage("\\image.png")};
sprite1 = new Sprite("sprite1", 32, 32, 0, 0, 0, 0, 0, 0, b);
System.out.println("load sprites");
}

   public static void main(java.lang.String[] args){
       Runningas = "Application";
       //canvas=frame;
       //new Game();
       //frame.setVisible(true);
       GameLoader game = new GameLoader();
        game.setup(new Game(), new Dimension(640,480), false);
        game.start();
//       OpenGLGameLoader g = new OpenGLGameLoader();
//       g.setupLWJGL(new Game(), new Dimension(640,480), false);
//       g.start();
   }
 
}
