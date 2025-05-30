package D49;

public class Q27 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int sum = 0;
        //拡張for文　一つずつ格納する変数も型宣言を忘れない
        for (int num : numbers) {
            sum += num;
        }

        System.out.println(sum);
    }
}
