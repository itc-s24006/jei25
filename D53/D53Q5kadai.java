package D53;

import java.util.Arrays;

public class D53Q5kadai {
    private static int[] taxes = {8, 10};
    private static int FOODS = 0;
    private static int OTHER = 1;

    public static void main(String[] args) {
        int dataSice = Integer.parseInt(args[0]); //データ数
        String[] names = new String[dataSice]; //商品名
        int[] prices = new int[dataSice]; //単価
        int[] nums = new int[dataSice]; //数量
        char[] types = new char[dataSice]; //タイプ
        int zeinukiTotal = 0; //税抜合計
        int zeikomiTotal = 0; //税込合計

        int argsIdx = 1;
        for (int i = 0; i < dataSice; i++) {
            names[i] = args[argsIdx++];
            prices[i] = Integer.parseInt(args[argsIdx++]);
            nums[i] = Integer.parseInt(args[argsIdx++]);
            types[i] = args[argsIdx++].charAt(0);
        }

//        System.out.println(Arrays.toString(names) + "\n" + Arrays.toString(prices) + "\n" + Arrays.toString(nums) + "\n" + Arrays.toString(types)); //デバッグ用

        System.out.println("商品名\t税抜\t税込\tタイプ");
        for (int i = 0; i < dataSice; i++) {
            int zeinuki = prices[i] * nums[i];
            int zeikomi, taxType;
            taxType = types[i] == 'f' ? FOODS : OTHER;
            zeikomi = zeinuki * (taxes[taxType] + 100) / 100; //税抜価格に税率を掛けて税込価格を計算
            zeinukiTotal += zeinuki;
            zeikomiTotal += zeikomi;
            System.out.print(names[i] + "\t" + zeinuki + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));
        }
        System.out.println("合計\t" + zeinukiTotal + "円\t" + zeikomiTotal + "円");
    }
    private static String viewType(char c) {
        return c == 'f' ? "食品等" : "その他";
    }
}
