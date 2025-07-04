package D51;

public class D51Q26kadai {
    public static void main(String[] args) {
        int n = 1;
        String s = "";
/*        switchはbreakを書かないと全部のcaseの処理が通る
        この減少をフォールスルーという。意図的にこの動作をさせる場合もあるが、
        多くの場合break文の書き忘れによるバグの原因となる*/
        switch (n) {
            case 1:
                s += "one";
                break;
            case 2:
                s += "two";
                break;
            default:
                s += "?";
        }
        System.out.print(s);
    }
}
