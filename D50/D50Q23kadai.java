package D50;

//mainメソッドで出力する
public class D50Q23kadai {
    String code;
    public static void main(String[] args) {
        D50Q23kadai obj = new D50Q23kadai();
        String result = obj.setCode("ごきげんよう");
        System.out.println(result);
    }

    String setCode(String c){
        return code = c;
    }
}
