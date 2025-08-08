package D53;

/*
コマンドライン引数として与えられた整数を合計し出力。
余裕があれば、引数が空の場合のエラー処理も考慮する
コンパイル及び実行して端末の画面スクショして提出
 */
public class D53kadaiA {
    public static void main(String[] args) {
        //引数が空の場合のエラー処理
        String check = args.length == 0 ? "１つ以上の数字を入力してください。" : "";
        System.out.println(check);

        int sum = 0;
        //入力値を整数に変換・合計
        for (String n: args) {
            sum += Integer.parseInt(n);
        }
        System.out.println("合計: " + sum);
    }
}
