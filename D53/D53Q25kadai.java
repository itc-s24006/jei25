package D53;

public class D53Q25kadai {
    public static void main(String[] args) {
        /*
        文字列を＝＝で比較すると、参照先が同じかどうかを比較するため、
        内容が同じでも違うインスタンスな限りfalseが出力される。
        ＝＝でtrueを出力したい場合は、インスタンスを生成するのではなく純粋に同じ文字列を
       代入して比較する必要がある。
         */
        char[] ch = {'A','B','C'};
        String s1 = "ABC";
        String s2 = "ABC";
        boolean b1 = s1 == s2;
        boolean b2 = s1.equals(s2);
        System.out.println(b1 + " " + b2);
    }
}
