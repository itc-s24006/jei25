package D51;

//3と5の公倍数を出力
public class D51Q24kadai {
    public static void main(String[] args) {
        for (int x = 1; x < 100; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.print(x + ", ");
            }
        }
    }
}
