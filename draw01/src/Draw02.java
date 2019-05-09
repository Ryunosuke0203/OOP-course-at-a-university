/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author BS117017
 */
public class Draw02 {
    // メインメソッド（エントリポイント）
	public static void main(String[] args)	 {

		// インスタンスの生成
                ColorPoint c = new ColorPoint();

		// フィールドへのアクセス
		c.x = 100;
		c.y = 100;
                c.r=255;
                c.g=0;
                c.b=0;

		// メソッドの呼び出し
		c.draw();
	}


}
