package ensyu01;

/* 明解Java
 * 演習 1-1
 * プログラム中の分の終端を示すセミコロン；が欠如しているとどうなるか。
 * プログラムをコンパイルして実行せよ。
 */

public class E_01_01 {
//コンパイルエラーになる旨を確認する処理
	public static void main(String[] args) {
		//エラーの確認だが、コンパイルが通るケースを残す
		System.out.println("test");

		// ;がないときの挙動
		// 構文エラーでコンパイルに失敗します。
		// System.out.println("test")

	}

}
