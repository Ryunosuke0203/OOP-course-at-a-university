
import java.awt.Graphics;

public abstract class Shape extends ColorPoint {
    public Shape()    {
        super();
        width = 20;
        height = 10;
    }
    public Shape(Graphics g){
    super(g);
    width=20;
    height=20;
    }
    
    protected int  width;
    protected int  height;
}


