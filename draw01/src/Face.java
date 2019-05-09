/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this timport canvasframe.CanvasFrame;
import java.awt.Graphics;emplate file, choose Tools | Templates
 * and open the template in the editor.
 */
import canvasframe.CanvasFrame;
import java.awt.Graphics;

/**
 *
 * @author BS117017
 */
public class Face implements Drawable{

    public Face(Graphics bg){
  
    shape = new Shape[3];
    
    shape[0] = new Oval(bg);
    shape[0].setX(100);
    shape[0].setY(100);
    shape[0].width=50;
    shape[0].height=50;
    shape[0].red=0;
    shape[0].green=0;
    shape[0].blue=255;

    
    shape[1] = new Oval(bg);
    shape[1].setX(300);
    shape[1].setY(100);
    shape[1].width=50;
    shape[1].height=50;
    shape[1].red=0;
    shape[1].green=0;
    shape[1].blue=255;
  
    
    shape[2]=new Rectangle(bg);
    shape[2].setX(200);
    shape[2].setY(300);
    shape[2].width=100;
    shape[2].height=30;
    shape[2].red=255;
    shape[2].green=0;
    shape[2].blue=0;
    
   
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