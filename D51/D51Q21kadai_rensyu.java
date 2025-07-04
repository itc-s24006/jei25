package D51;

import java.util.ArrayList;
import java.util.List;

//異なる基数同士を計算するオリジナルプログラムを作りなさい
public class D51Q21kadai_rensyu {
    public static void main(String[] args) {
        //10進数と2進数の計算
        int decimal = 21; //10進数
        int binary = 10101;//2進数


        List<Integer> binarylist = new ArrayList<>();
        // ↓ 文字列型に変換
        String binary_toStr = String.valueOf(binary);
        // ↓ 一桁ずつリストに格納
        for (String str : binary_toStr.split("")) {
            // ↓ int型に戻してリストに追加
            binarylist.add(Integer.parseInt(str));
        }
        //インデックスを桁の重みとして掛けるために逆順にしたリストを作成
        List<Integer> reversed = new ArrayList<>();
        for (int i = binarylist.size() - 1; i >= 0; i--) {
            reversed.add(binarylist.get(i));
        }
        //インデックスを桁の重みとして掛ける
        for (int r=0; r < reversed.size(); r++) {

//            reversed.set(r,reversed[r]*r);
        }






    }
}
