package D52;

class Q33kadai {
    public static void main(String[] args) {
        String[] scenario = new String[5];
        scenario[0] = "i 100";
        scenario[1] = "p 2";
        scenario[2] = "i 500";
        scenario[3] = "p 3";
        scenario[4] = "c 0";

        Drink2[] dr = {
                new Drink2("Gomacola", 150),
                new Drink2("MrPepper", 130),
                new Drink2("Saltwater", 320)
        };
        VendingMachine2 vm = new VendingMachine2(dr);

        //操作　i:お金入れる　p:商品を購入 　c:お釣り払い出し
        vm.display();
        vm.nowCash();
        for (String s: scenario) {
            vm.execCom(s);
        }
    }
}

class Drink2 { //商品の名前と価格を管理・取得
    private String name;
    private int price;

    Drink2(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String toString() {
        return "[" + name + "] " + price + "円";
    }
}

class VendingMachine2 { //自動販売機本体
    private Drink2[] drinks2; //商品を管理する配列
    private int cash = 0; //投入額
    private int[] coins = { 500, 100, 50, 10 }; //受け付ける硬貨

    VendingMachine2(Drink2[] drinks2) {
        this.drinks2 = drinks2;
    }

    //販売する商品を１番めから順に表示する
    public void display() {
        int idx = 1;
        for (Drink2 drink2 : drinks2) {
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
                if (idx < 0 || idx > drinks2.length) return; //存在しない商品が入力されたら何もしない
                int price = drinks2[idx].getPrice();
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
        System.out.println(drinks2[idx] + " が排出されました");
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

    //現在の投入額を表示する
    public void nowCash() {
        System.out.println("現在の投入額：" + cash);
    }
}

