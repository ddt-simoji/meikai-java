package ensyu02;

/* 明解Java
 * 演習 2-2
 *
 * 3つのint型変数に値を代入し、合計と平均を求めるプログラムを作成せよ。
 */

public class E_02_02 {
//3つのint型変数に値を代入し、合計と平均を求める処理。
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
			//計算し、合計を表示する。
			System.out.println("合計：" + ( x + y + z));
			//計算し、平均を表示する。
			System.out.println("平均：" + ( x + y + z)/3);
	}

}
