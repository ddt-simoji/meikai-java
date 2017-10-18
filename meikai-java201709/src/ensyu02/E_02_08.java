package ensyu02;

import java.util.Random;
import java.util.Scanner;

/* 明解Java
 * 演習 2-8
 *
 *キーボードから読み込んだ整数値±5の範囲の整数値を
 *ランダムに生成して表示するプログラムを作成せよ。
 */

public class E_02_08 {

	public static void main(String[] args) {
		// 乱数を生成するにに必要なため標記する
		Random rand = new Random();
		// メッセージ表示
		System.out.print("整数値:");
		
		// 整数値を入力させる
		Scanner stdIn  = new Scanner(System.in); 
		
		// int型に変換
		int num1 = stdIn.nextInt();

		// 乱数を作成(+5～-5の範囲)
		int num2 = (int)( Math.random() * (10 + 1) ) - 5;

		// 入力した数値を足す
		int num3 =( num1 + num2 );

		// 結果表示
		System.out.println("その値の±5の乱数を生成しました。それは" + num3 + "です。");
	}

}
