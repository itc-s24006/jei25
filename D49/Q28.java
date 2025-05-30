package D49;

public class Q28 {
    public static void main(String[] args) {
        int limit = Integer.parseInt(args[0]);
        int base1 = Integer.parseInt(args[1]);
        int base2 = Integer.parseInt(args[2]);

        int common = base1 * base2; //最小公倍数を格納

        for (int i=1; i<=limit; i++) {
            if (i%common==0) {
                System.out.println(i + ":base1,base2");
                continue;
            }
            if (i % base1 == 0) {
                System.out.println(i + ":base1");
                continue;
            }
            if (i % base2 == 0) {
                System.out.println(i + ":base2");
                continue;
            }
            System.out.println(i);
        }
    }
}
