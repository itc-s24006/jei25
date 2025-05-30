package D49;

public class Q25 {
    public static void main(String[] args) {
        double a = 12.3;
        double b = 4.5;
        Q25 o = new Q25();
        int c = o.number(a, b);
        System.out.println(c);
    }

    public int number(double v1, double v2) {
        return (int) (v1 / v2);
    }
}
