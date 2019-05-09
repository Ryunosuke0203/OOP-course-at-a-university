/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BS117017
 */
import canvasframe.CanvasFrame;
public class Draw03 {
   
    // メインメソッド（エントリポイント）
	public static void main(String[] args)	 {

		// インスタンスの生成
               CanvasFrame canvas=new CanvasFrame();
               canvas.setVisible(true);
               Point p=new Point(canvas.getBG());
               p.move(100, 100);
               canvas.repaint();
		// メソッドの呼び出し
	
	}


}


