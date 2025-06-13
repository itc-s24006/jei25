package D50;

//基本挿入法での並び替え
public class Q28 {
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
            }
        }

        for (int val: num){
            System.out.println(val + " ");
        }
    }
}
