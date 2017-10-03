package ensyu02;

/* 明解Java
 * 演習 2-2
 *
 * 3つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 */

public class E_02_02 {
//3つのint型変数に値を代入し、合計と平均を求める処理。
	public static void main(String[] args) {
		int num1 = 10;  //
		int num2 = 20;
		int num3 = 30;
			//計算し、合計を表示する。
			System.out.println("合計：" + ( num1 + num2 + num3));
			//計算し、平均を表示する。
			System.out.println("平均：" + ( num1 + num2 + num3)/3);
	}

}
