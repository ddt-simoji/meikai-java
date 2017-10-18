package ensyu02;
import java.util.Random;

/* 明解Java
 * 演習 2-7
 *
 * 以下に示すプログラムを作成せよ。
 *
 * ・1桁の正の整数値（すなわち1以上9以下の値）をランダムに生成して表示。
 * ・1桁の負の整数値（すなわち-9以上-1以下の値）をランダムに生成して表示。
 * ・2桁の正の整数値（すなわち10以上99以下の値）をランダムに生成して表示。
 */

public class E_02_07 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int num1 = rand.nextInt(9);  //変数の宣言
		int num2 = rand.nextInt(9);  //変数の宣言
		int num3 = rand.nextInt(90); //変数の宣言

		//0以上9未満の乱数 +1 を表示する
		System.out.println("1以上9以下のランダムな値:"+ (num1+1));
		//0以上9未満の乱数 -10 を表示する
		System.out.println("-9以上-1以下のランダムな値:"+ (num2-10));
		//0以上9未満の乱数 +10 を表示する
		System.out.println("10以上99以下のランダムな値:" + (num3+10));
	}
}
