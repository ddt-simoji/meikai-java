package ensyu02;

import java.util.Scanner;

/* 明解Java
 * 演習 2-6
 *
 * 三角形の底辺と高さを読み込んで、その面積を表示するプログラムを作成せよ。
 */

public class E_02_06 {
	//三角形の底辺と高さを読み込んで、その面積を表示する処理
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("三角形の面積を求めます。");
		//xの値の入力を促す
		System.out.println("底辺：");
		//xに整数値を読み込む
		double x = stdIn.nextDouble();

		//yの値の入力を促す
		System.out.println("高さ：");
		//yに整数値を読み込む
		double y = stdIn.nextDouble();

		//底辺×高さ÷２
		System.out.println("面積は" + (( x * y ) /2 ) + "です。");
	}
}
