/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.event.*;
/**
 *
 * @author BS117017
 */
public class Pen implements MouseMotionListener{
    
    public void mouseDragged(MouseEvent e){
    double x =e.getX();
    double y =e.getY();
    move(x,y);
    e.getComponent().repaint();
    }
    
    public void mouseMoved(MouseEvent e){
    
    }
    
    public void move(double x,double y){
        tip.move(x,y);
    }


public void setTip(Movable tip){
    this.tip=tip;
    
    
}
private Movable tip;
}