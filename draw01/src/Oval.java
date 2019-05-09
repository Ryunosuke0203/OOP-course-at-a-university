
import java.awt.Graphics;
import java.awt.Color;

public class Oval extends Shape implements Drawable,Movable {
    public Oval()    {
        super();
    }
    
    public Oval(Graphics g){
    super(g);
    }
  public void draw()  {
        int x1 = (int)(x-width/2.0);
        int y1 = (int)(y-height/2.0);
        bg.setColor(new Color(red, green, blue));
        
        bg.fillOval(x1, y1, width, height);
           


   
  }   
}

