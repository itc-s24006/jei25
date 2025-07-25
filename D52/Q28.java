package D52;

public class Q28 {
    public static void main(String[] args) {
        String majors = "+----";
        int LIMIT = 400;
        if (args.length == 0) return; //整数値が一つも入力されてない時終了
        int max = 0, i = 0;
        int[] data = new int[args.length]; //入力された数値格納
        for (String s : args) {
            data[i] = Integer.parseInt(s);
            if (data[i] < 1 || data[i] >= 400) return; //範囲外の時終了
            if (max < data[i]) {
                max = data[i];
            }
            i++;
        }

        //メモリ表示
        int majormax = (max - 1) / 5 + 1;
        System.out.print("       ");
        for (i = 0; i < majormax; i++) {
            System.out.print(majors.charAt(i % 5));
        }
        System.out.println("");

        //グラフ表示
        for (i=0; i<data.length; i++) {
            System.out.printf("%4d : ", data[i]);
            int n = (data[i] - 1) / 5 + 1;
            for (int j=0; j<n; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }
}
