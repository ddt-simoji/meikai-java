package ensyu02;

import java.util.Scanner;

/* 明解Java
 * 演習 2-4
 *
 * キーボードから読み込んだ整数値に10を加えた値と
 * 10を減じた値を出力するプログラムを出力せよ。
 */

public class E_02_04 {
	//キーボードから読み込んだ整数値に10を加えた値と10を減じた値を出力する処理
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		//xの値の入力を促す
		System.out.println("整数値：");
		//xに整数値を読み込む
		int x = stdIn.nextInt();

		//10を加えて表示
		System.out.println("10を加えた値は" + ( x + 10 ) + "です。");
		//10を減じて表示
		System.out.println("10を減じた値は" + ( x - 10 ) + "です。");
	}
}
