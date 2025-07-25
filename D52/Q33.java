package D52;

class Q33 {
    public static void main(String[] args) {
        Drink2[] dr = {
                new Drink2("Gomacola", 150),
                new Drink2("MrPepper", 130),
                new Drink2("Saltwater", 320)
        };
        VendingMachine2 vm = new VendingMachine2(dr);

        //操作　i:お金入れる　p:商品を購入 　c:お釣り払い出し
        vm.display();
        vm.execCom("i 100");
        vm.execCom("p 2");
        vm.execCom("i 500");
        vm.execCom("p 3");
        vm.execCom("c 0");
    }
}

class Drink { //商品の名前と価格を管理・取得
    private String name;
    private int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String toString() {
        return "[" + name + "] " + price + "円";
    }
}

class VendingMachine { //自動販売機本体
    private Drink2[] drink2s; //商品を管理する配列
    private int cash = 0; //投入額
    private int[] coins = { 500, 100, 50, 10 }; //受け付ける硬貨

    VendingMachine (Drink2[] drink2s) {
        this.drink2s = drink2s;
    }

    //販売する商品を１番めから順に表示する
    public void display() {
        int idx = 1;
        for (Drink2 drink2 : drink2s) {
            System.out.println("〔" + idx + "〕" + drink2);
            idx ++;
        }
    }

    //引数のコマンドを解釈して処理を行う
    public void execCom (String command) {
        String[] s = command.split(" ");
        switch(s[0]) {
            case "i": //お金入れる
                if (isCoin(s[1])) cash += Integer.parseInt(s[1]);
                break;
            case "p": //商品を購入
                int idx= Integer.parseInt(s[1]) - 1; //入力された商品番号と配列のインデックスを揃える
                if (idx < 0 || idx > drink2s.length) return; //存在しない商品が入力されたら何もしない
                int price = drink2s[idx].getPrice();
                if (price <= cash) {
                    eject(idx);
                    cash -= price;
                    payChange();
                } else {
                    System.out.println("お金が足りません");
                }
                break;
            case "c": //お釣り払い出し
                payChange();
                break;
            default:
                break;
        }
    }

    //引数の金額が、自動販売機で受け付けられたらTrue
    private boolean isCoin(String s) {
        int c = Integer.parseInt(s);
        for (int coin : coins) {
            if (c == coin) return true;
        }
        return false;
    }

    //指定された商品を排出したメッセージを表示
    private void eject(int idx) {
        System.out.println(drink2s[idx] + " が排出されました");
    }

    //お釣りを払い出す
    private void payChange() {
        if (cash == 0) {
            System.out.println("お釣りなし");
            return;
        }
        String s = "お釣り ";
        for (int coin : coins) {
            if (cash / coin > 0) {
                s += coin + ":" + (cash / coin) + "枚";
                cash %= coin;
            }
        }
        System.out.println(s);
    }
}

