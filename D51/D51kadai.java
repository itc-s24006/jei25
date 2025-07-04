package D51;

//実行時に与えられたコマンドライン引数の２番目を実数に変換し、切り上げて表示
public class D51kadai {
    public static void main(String[] args) {
        double toDouble = Double.parseDouble(args[1]);
        double toCeil = Math.ceil(toDouble);
        System.out.println(toCeil);
    }
}
