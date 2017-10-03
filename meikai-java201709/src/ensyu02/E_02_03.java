package ensyu02;
import java.util.Scanner;

/* 明解Java
 * 演習 2-3
 * 
 * キーボードから読み込んだ整数値を
 * そのまま反復して表示するプログラムを作成せよ。
 */

public class E_02_03 {
	//キーボードから整数値を入力させ、反復して表示する。
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//xの値の入力を促す
		System.out.println("整数値：");
		//xに整数値を読み込む
		int x = stdIn.nextInt();           
		
		//結果を表示する
		System.out.println( x + "と入力しましたね。");
	}
}