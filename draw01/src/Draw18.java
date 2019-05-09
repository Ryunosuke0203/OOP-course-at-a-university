
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
public class Draw18 {
      public static void main(String[] args){
         CanvasFrame canvas=new CanvasFrame();
    canvas.setVisible(true);
     Graphics bg =canvas.getBG();
     
   Pen pen=new Pen();
   Oval o= new Oval(bg);
   o.width=30;
   o.height=30;
   o.red=0;
   o.green=0;
   o.blue=255;
   pen.setTip(o);
   
   canvas.getComponent().addMouseMotionListener(pen);
}
}
