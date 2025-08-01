package D53;

import org.w3c.dom.ls.LSOutput;

public class Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

         int n = (int)(i + f); // コンパイルエラー: floatをintに暗黙的に変換できない
         System.out.println(n);

    }
}
