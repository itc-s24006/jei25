package D53;

/*
次の10進数の値を、指定された形式の数値リテラルを使って byte 型の変数に格納してください。
10進数の 63 → 2進数リテラル（0b）で byte a に代入
10進数の 64 → 8進数リテラル（0）で byte b に代入
10進数の 65 → 16進数リテラル（0x）で byte c に代入
 */
public class D53Q21kadai {
    public static void main(String[] args) {
        byte a = 0b111111; // 63 2進数リテラル
        byte b = 0100;  // 64 8進数リテラル
        byte c = 0x41; // 65 16進数リテラル

        System.out.println("a: " + a); // 63
        System.out.println("b: " + b); // 64
        System.out.println("c: " + c); // 101

    }
}
