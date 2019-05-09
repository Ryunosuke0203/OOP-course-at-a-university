import canvasframe.CanvasFrame;
import java.awt.Graphics;
import java.awt.Color;

public abstract class ColorPoint extends Point  {
   public ColorPoint()  {
       super();
       red = 0;
       green = 0;
       blue = 0;
   }


 public ColorPoint(Graphics g){
     super(g);
        red = 0;
       green = 0;
       blue = 0;
 }
public void setColor(int r,int g,int b){
 red=r;
 green=g;
 blue=b;
    
}
protected int red;
protected int green;
protected int blue;
}


