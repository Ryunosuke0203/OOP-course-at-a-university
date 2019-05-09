/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Graphics;
/**
 *
 * @author BS117017
 */
public class Face02 implements Drawable{
    public Face02(Graphics bg){
    
        this.bg=bg;
        drawable= new Drawable[4];
       
        drawable[0]=new Face(bg);
        Rectangle rect=new Rectangle(bg);
     
        rect.setX(200);
        rect.setY(200);
        rect.height=50;
        rect.width=25;
        rect.red=0;
        rect.green=255;
        rect.blue=0;
        drawable[1]=rect;
        
 
        Oval o=new Oval(bg);
        o.setX(100);
        o.setY(200);
        o.height=25;
        o.width=25;
        o.red=255;
        o.green=0;
        o.blue=0;
        drawable[2]=o;
     
        o=new Oval(bg);
        o.setX(300);
        o.setY(200);
        o.height=25;
        o.width=25;
        o.red=255;
        o.green=0;
        o.blue=0;
        drawable[3]=o;

        
    }
    
    public void draw(){
    for(int i=0;i<drawable.length;i++){
       drawable[i].draw();
    }
    }
    
    private Drawable[] drawable;
    Graphics bg;
}
