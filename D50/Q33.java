package D50;

public class Q33 {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        //maxに最大値、minに最小値が入っているかの判定
        if (max < min){
            int tmp = max;
            max = min;
            min = tmp;
        }
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);
        int[] part = primeNumbers.getPart(min, max);

        for (int prime : part){
            System.out.printf("%d, ", prime);
        }
    }
}

// 素数判定配列を保持し、指定された範囲の素数判定を行うクラス
class PrimeNumbers{
    boolean[] isPrimeNumbers;

    //素数判定配列を設定・判定するメソッド
    void initializePrimeNumbers(int max){
        isPrimeNumbers = new boolean[max+1];
        for (int i = 2; i <= max; i++){
            isPrimeNumbers[i] = true;
        }

        for (int p = 2; p <= Math.sqrt(max); p++){
            if (isPrimeNumbers[p]){ //trueの場合
                for (int m = p*2 ; m <= max; m += p){
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }
    //素数判定配列から素数を抜き出し、結果を配列で返す
    int[] getPart(int min, int max){
        int count = 0;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++){
            if (isPrimeNumbers[n]){
                part[index++] = n;
            }
        }
        return part;
    }


}
