/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BS117017
 */

import java.awt.Graphics;
import canvasframe.CanvasFrame;
import java.awt.Color;


public class Draw01 {
    
   public static void main(String[] args) {
	// インスタンスの生成と可視化
        CanvasFrame canvas = new CanvasFrame();
        canvas.setVisible(true);

	// グラフィックスの取得と描画
        Graphics bg = canvas.getBG();
        double a=1;
        double b=20;
        int x;
        int y;
        float rr;
        float gg=0.0f;
        float bb=0.0f;
        float ra=1.0f/600.0f;
        float rb=-1.0f;
        float ga=1.0f/600.0f;
        float gb=0.0f;
        float ba=1.0f/600.0f;
        float bbb=0.0f;
       
      
      
        for(x=20;x<580;x+=5){
           y=(int)(a*x+b);
           rr=ra*x+rb;
           if(rr<0.0f){
           rr=0.0f;
           }
           else if(rr>1.0f){
           rr=1.0f;
           }
          
           gg=ga*x+gb;
           if(gg<0.0f){
           gg=0.0f;
           }
           else if(gg>1.0f){
           gg=1.0f;
           }
           
           bb=ba*x+bbb;
           if(bb<0.0f){
           bb=0.0f;
           }
           else if(bb>1.0f){
           bb=1.0f;
           }
           
          
        bg.setColor(new Color(rr,gg,bb));
        bg.fillRect(x,y,10,10);
        }
         a=1;
         b=20;
      
        
       
        gg=0.0f;
        bb=0.0f;
        ra=1.0f/600.0f;
        rb=-1.0f;
        ga=1.0f/600.0f;
        gb=-1.0f;
        ba=1.0f/600.0f;
        bbb=-1.0f;
	// 表示処理
        for(x=20;x<580;x+=5){
           y=-(int)(a*x+b);
           rr=ra*x+rb;
           if(rr<0.0f){
           rr=0.0f;
           }
           else if(rr>1.0f){
           rr=1.0f;
           }
          
           gg=ga*x+gb;
           if(gg<0.0f){
           gg=0.0f;
           }
           else if(gg>1.0f){
           gg=1.0f;
           }
           
           bb=ba*x+bbb;
           if(bb<0.0f){
           bb=0.0f;
           }
           else if(bb>1.0f){
           bb=1.0f;
           }
           
          
        bg.setColor(new Color(rr,gg,bb));
        bg.fillRect(x,y,10,10);
        }
         canvas.repaint();
   }
  
}
