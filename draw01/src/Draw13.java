
import canvasframe.CanvasFrame;
import java.awt.Graphics;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BS117017
 */
public class Draw13 {
     public static void main(String[] args){
         CanvasFrame canvas=new CanvasFrame();
    canvas.setVisible(true);
     Graphics bg =canvas.getBG();
    Face02 face = new Face02(bg);
    face.draw();
}
}
