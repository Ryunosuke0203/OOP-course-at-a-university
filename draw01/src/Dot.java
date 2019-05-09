import canvasframe.CanvasFrame;
import java.awt.Graphics;
import java.awt.Color;

public class Dot extends Shape implements Drawable,Movable {
    public Dot()    {
        super();
    }
    public Dot(Graphics g){
   super(g);
    }
    
    public void draw()  {
        int x1 = (int)(x - width / 2.0);
        int y1 = (int)(y - height / 2.0);
        bg.setColor(new Color(red, green, blue));
        
        bg.fillDot(x1, y1, width, height);
    }
}
