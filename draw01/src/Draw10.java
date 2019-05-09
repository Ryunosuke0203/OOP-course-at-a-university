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
public class Draw10 {
    public static void main(String[] args){
    CanvasFrame canvas=new CanvasFrame();
    canvas.setVisible(true);
    Graphics bg =canvas.getBG();
    
    ColorPoint p=new Rectangle(bg);
    p.setColor(255,0,0);
    p.x=100;
    p.y=100;
    p.draw();
    
    p=new Oval(bg);
    p.setColor(0,255,0);
    p.x=200;
    p.y=100;
    p.draw();
    }
    
}
