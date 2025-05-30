package D49;

public class Q23 {
    public static void main(String[] args) {
        double n = Double.parseDouble(args[2]) * 1.5;
        /*
        Double.parseDouble() double型に変換
        args[2] main関数が持っている引数(リスト)
            実行時に 'java (ファイル名) (リストに格納する引数)'
            をするとmain内で使える
            [2]はインデックスの指定
         */
        System.out.print(n);
    }
}
