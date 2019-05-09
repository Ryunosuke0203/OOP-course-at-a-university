
import canvasframe.CanvasFrame;
import java.awt.Graphics;
import java.awt.Color;
/**
 *
 * @author BS117017
 */
public class Animal{

    public Animal(Graphics bg){
  
    shape = new Shape[11];
    
    shape[0] = new Oval(bg);
    shape[0].setX(300);
    shape[0].setY(100);
    shape[0].width=50;
    shape[0].height=50;
    shape[0].red=0;
    shape[0].green=255;
    shape[0].blue=0;

    
    shape[1] = new Oval(bg);
    shape[1].setX(300);
    shape[1].setY(100);
    shape[1].width=50;
    shape[1].height=50;
    shape[1].red=0;
    shape[1].green=255;
    shape[1].blue=0;
  
    
    shape[2]=new Rectangle(bg);
    shape[2].setX(100);
    shape[2].setY(555);
    shape[2].width=100;
    shape[2].height=30;
    shape[2].red=255;
    shape[2].green=255;
    shape[2].blue=255;
    
    shape[3] = new Oval(bg);
    shape[3].setX(270);
    shape[3].setY(100);
    shape[3].width=50;
    shape[3].height=50;
    shape[3].red=0;
    shape[3].green=255;
    shape[3].blue=0;
    
     shape[4] = new Oval(bg);
    shape[4].setX(240);
    shape[4].setY(100);
    shape[4].width=50;
    shape[4].height=50;
    shape[4].red=0;
    shape[4].green=255;
    shape[4].blue=0;
    
    shape[5] = new Oval(bg);
    shape[5].setX(210);
    shape[5].setY(100);
    shape[5].width=50;
    shape[5].height=50;
    shape[5].red=0;
    shape[5].green=255;
    shape[5].blue=0;
    
     shape[6] = new Oval(bg);
    shape[6].setX(180);
    shape[6].setY(100);
    shape[6].width=50;
    shape[6].height=50;
    shape[6].red=0;
    shape[6].green=255;
    shape[6].blue=0;
    
    shape[7] = new Oval(bg);
    shape[7].setX(150);
    shape[7].setY(100);
    shape[7].width=50;
    shape[7].height=50;
    shape[7].red=0;
    shape[7].green=255;
    shape[7].blue=0;
    
    shape[8] = new Oval(bg);
    shape[8].setX(150);
    shape[8].setY(100);
    shape[8].width=50;
    shape[8].height=50;
    shape[8].red=255;
    shape[8].green=0;
    shape[8].blue=0;
    
    shape[9] = new Oval(bg);
    shape[9].setX(140);
    shape[9].setY(97);
    shape[9].width=5;
    shape[9].height=5;
    shape[9].red=0;
    shape[9].green=0;
    shape[9].blue=0;
    
    shape[10] = new Oval(bg);
    shape[10].setX(160);
    shape[10].setY(97);
    shape[10].width=5;
    shape[10].height=5;
    shape[10].red=0;
    shape[10].green=0;
    shape[10].blue=0;

     this.draw();
     
}
    public void draw(){
    for(int i = 0; i < shape.length; i++){
      shape[i].draw();
    }
    }
    private Shape[] shape;
    protected Graphics bg;
}