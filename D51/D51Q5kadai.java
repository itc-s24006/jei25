package D51;
/*
ガス代金が値上げされた
　- 基本料金が100円値上げ
　- 従量単価が各1円ずつ値上げ

これらの変更を反映しなさい
[実行例]
java D51Q5kadai 61.8
今月のガス代金は1751円
449
 */
public class D51Q5kadai {
    public static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE};   //使用量の区分
        double[] unit = {0.0, 2.0, 3.0, 5.0};    //単位数
        int[] rate = {0, 20, 18, 15};   //従量料金単価
        if (args.length != 1) {
            System.out.println("引数の個数が不正");
            return;
        }
        //入力された使用量を数値型に変換したもの↓
        double amount = Double.parseDouble(args[0]);
        if (amount < 0) {
            System.out.println("0.0以上の使用量を入力");
            return;
        }

        int i, price = 1300; //iは未初期化
        for (i = 1; amount >= level[i]; i++){
            price += (int)((level[i] - level[i-1]) / unit[i]) * rate[i];    //57.0未満の計算
        }
        price += (int) Math.ceil((amount - level[i-1]) / unit[i]) * rate[i];    //57.0以上の計算
        System.out.println("今月のガス料金 " + price + "円");

    }
}
