package D53;
enum Udon {
    KAKE("かけ", 290),
    KITSUNE("きつね", -380),
    CURRY("カレー", 490),
    TEMPURA("天ぷら", 150);

    private String japaneseName;
    int price;

    Udon(String japaneseName, int price) {
        this.japaneseName = japaneseName;
        if (price >= 0) {
            this.price = price;
        } else {
            this.price = -1 * price; //絶対値に変換
        }
    }

    public String toString() {
        return japaneseName + ":" + price + "円";
    }
}
public class Q27 {
    public static void main(String[] args) {
        System.out.println(Udon.KITSUNE);
        System.out.println(Udon.TEMPURA);

    }
}
