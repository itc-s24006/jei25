package D51;

public class D51Q20kadai {
    public static void main(String[] args) {
        boolean flg = true;
        int score = 85;
        String result = (flg = score >= 75) ? "合格" : "不合格";
        System.out.println(result);
    }
}
