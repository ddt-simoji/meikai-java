package ensyu02;

import java.util.Scanner;

/* 明解Java
 * 演習 2-10
 * 
 * 名前の姓と名を個別にキーボード読み込んで、挨拶を行うプログラムを作成せよ。
 */

public class E_02_10 {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		//メッセージを表示する
		System.out.print("姓：");
		//キーボードから読み込んで name1 に代入
		String name1 = stdIn.next();
		
		//メッセージを表示する
		System.out.print("名：");
		//キーボードから読み込んで name2 に代入
		String name2 = stdIn.next();
		
		//挨拶文を表示する
		System.out.println("こんにちは" + ( name1 + name2 ) + "さん。");
	}

}
