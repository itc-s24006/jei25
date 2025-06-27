package D51;

public class D51Q19kadai {
    public static void main(String[] args) {
        float f = 4.7f;
        double d = 0.86;
        /*異なるデータ型間の演算を行うと、表現可能な値の範囲が広い方の型に合わせられる
        floatよりdoubleのほうが範囲が広いためdouble型で宣言する必要がある*/
        // ↓float にすると精度が失われるためコンパイルエラーになる
        double ans = f * d;
        System.out.println(ans);
    }
}
