package ensyu02;

import java.util.Random;

/* 明解Java
 * 演習 2-9
 * 
 * 以下に示すプログラムを作成せよ（実数値の乱数の生成にはnextDouble()を使うこと）。
 * 
 * ・0.0以上1.0未満の実数値をランダムに生成して表示。
 * ・0.0以上10.0未満の実数値をランダムに生成して表示。
 * ・-1.0以上1.0未満の実数値をランダムに生成して表示。
 *
 */

public class E_02_09 {

	public static void main(String[] args) {
		// 乱数を生成するにに必要なため標記する
		Random rand = new Random();
		
		double num1 = rand.nextDouble();  //0.0以上～1.0未満の実数をランダムに生成
		double num2 = rand.nextDouble()*10.0;  //0.0以上10.0未満の実数をランダムに生成
		double num3 = rand.nextDouble()*2.0-1.0;  //-1.0以上1.0未満の実数をランダムに生成

		//生成した乱数を表示する
		System.out.println("0.0以上1.0未満のランダムな値:"+ num1);
		System.out.println("0.0以上10.0未満のランダムな値:"+ num2);
		System.out.println("-1.0以上1.0未満のランダムな値:"+ num3);
	}
}
