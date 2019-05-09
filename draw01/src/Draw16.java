
import canvasframe.CanvasFrame;
import java.awt.Graphics;

public class Draw16  {
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
   
   pen.move(100, 100);
   
   double px=100;
   double py=150;
   for(int i=0;i<100;i++){
      pen.move(px,py);
      px++;
      py++;
       
      }
}
}
