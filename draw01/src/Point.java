
import canvasframe.CanvasFrame;
import java.awt.Graphics;
    
public abstract class Point {
    public Point()  {
        x = 0;
        y = 0;
        CanvasFrame canvas = new CanvasFrame();
        canvas.setVisible(true);
        bg = canvas.getBG();
    }
    public Point(Graphics g){
    bg=g;
    }

    protected abstract void draw();

    public void move(double x, double y)  {
        this.x = x;
        this.y = y;
        draw();
    }
    public double getX()  {
       return  x;
    }
    public double getY()  {
        return  y;
    }
    public void setX(double x){
    this.x=x;
    }
    public void setY(double y){
    this.y=y;
    }
    
    
    protected double  x;
    protected double  y;
    protected Graphics bg;
}


