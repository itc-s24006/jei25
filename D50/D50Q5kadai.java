package D50;

import java.util.Arrays;

//ソート途中のリストも出力　課題
public class D50Q5kadai {
    public static void main(String[] args) {
        int[] num = new int[args.length];

        for (int i = 0; i < args.length; i++) {
            num[i] = Integer.parseInt(args[i]);
        }

        int tmp; //退避用の変数
        for (int i = 1; i < num.length; i++) {
            for (int j = i - 1; j >= 0 && num[j] > num[j+1]; j--) {
                tmp = num[j];
                num[j] = num[j+1];
                num[j + 1] = tmp;
                //リスト形式でそのまま出力ならこれ↓
//                System.out.println("ソート途中：" + Arrays.toString(num));
                System.out.print("ソート途中：");
                for (int val: num){
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }

        System.out.print("------------------\nソート結果:");
        for (int val: num){
            System.out.print(val + " ");
        }
    }
}
