
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
public class Draw17 {
      public static void main(String[] args){
         CanvasFrame canvas=new CanvasFrame();
    canvas.setVisible(true);
     Graphics bg =canvas.getBG();
     
   Pen pen=new Pen();
   Rectangle rect= new Rectangle(bg);
   rect.width=30;
   rect.height=30;
   rect.red=0;
   rect.green=0;
   rect.blue=255;
   pen.setTip(rect);
   
   canvas.getComponent().addMouseMotionListener(pen);
}
}
