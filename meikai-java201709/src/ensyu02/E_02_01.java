package ensyu02;

/* 明解Java
 * 演習 2-1
 *
 *下記の
 * x = 63;
 * y = 18;
 *の箇所を、小数部を持つ実数値をxとyに代入するように変更して、その結果を考察せよ。
 */

public class E_02_01 {

	public static void main(String[] args) {
		int x;
		int y;

		x = 63.5;
		y = 18.5;

		System.out.println("xの値は" + x + "です。");
		System.out.println("yの値は" + y + "です。");
		System.out.println("合計は" + ( x + y) + "です。");
		System.out.println("平均は" + ( x + y ) / 2 + "です。");
	}

}
