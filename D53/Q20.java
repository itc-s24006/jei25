package D53;

public class Q20 {
    public static void main(String[] args) {
        int i = 8;
        float f = 3.27f;

         int n = (int)(i + f);
         //floatをintに暗黙的に変換できないため、明示的にキャストする必要がある。
         System.out.println(n);

    }
}
