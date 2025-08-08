package D53;
/*
【問題1】java D53Q6kadai b F 8 F 8
【問題2】java D53Q6kadai b 6 9 F 9
【問題3】java D53Q6kadai b 7 9 8 F
【問題4】java D53Q6kadai b 3 5 9 1
 */
public class D53Q6kadai {
    private static String hex = "0123456789ABCDEF";

    public static void main(String[] args) {
        if (args.length != 5) {
            return;
        }
        if (args[0].equals("b")) { //16進数が入力された　
            for (int i = 1; i <= 4; i++) {
                int num = hex.indexOf(args[i]);
                System.out.println(intToStr(num));
            }
        }else if (args[0].equals("g")) { //２値画像が入力された
            for (int i = 1; i <= 4; i++) {
                System.out.println(StrToInt(args[i]));
            }
        }
    }

    private static String intToStr(int x) {
        String s = "";
        for (int i = 0; i < 4; i++) {
            if (x % 2 == 0) {
                s = "." + s; //偶数なら0を追加
            } else {
                s = "o" + s; //奇数なら1を追加
            }
            x /= 2;
        }
        return s;
    }

    public static String StrToInt(String s) {
        int x = 1, sum = 0;
        for (int i = 3; i >= 0; i--) {
            if (s.charAt(i) == 'o') {
                sum += x; //1なら加算
            }
            x *= 2; //2の累乗を計算
        }
        return hex.substring(sum, sum + 1); //16進数に変換して返す
    }
}
