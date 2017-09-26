package ensyu02;

import java.util.Scanner;

/* 明解Java
 * 演習 2-5
 * 
 * キーボードから二つの実数値を読み込み、その和と平均を求めて表示するプログラムを作成せよ。
 */

public class E_02_05 {
	//キーボードから二つの実数値を読み込み、その和と平均を求めて表示する
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("xの値：");    //xの値の入力を促す
		double x = stdIn.nextDouble();   //xに整数値を読み込む
		
		System.out.println("yの値：");    //yの値の入力を促す
		double y = stdIn.nextDouble();   //yに整数値を読み込む
		
		System.out.println("合計は" + ( x + y ) + "です。");       //計算し、合計を表示
		System.out.println("平均は" + (( x + y) /2 ) + "です。");  //計算し、平均を表示
	}
}
