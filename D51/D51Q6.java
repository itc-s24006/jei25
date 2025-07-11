package D51;

public class D51Q6 {
    public static void main(String[] args) {
        Item[] li = {new Item("AA", "魚類"), new Item("BB", "肉類")}; //大分類コード一覧
        Item[] si = {new Item("A1", "さば"), new Item("A2", "さんま"), //小分類コード一覧
            new Item("B1", "牛肉"), new Item("B2", "鶏肉"),
            new Item("B3","豚肉"), new Item("B4", "加工肉") };

        ItemMaster im = new ItemMaster(li, si);
        String lcode = args[0].substring(0,2);  //実際の大分類コード
        String scode = args[0].substring(2, 4);  //実際の小分類コード
        String details = args[0].substring(4);  //実際の詳細コード

        String lname = im.getItemName(im.MAJOR, lcode);
        String sname = im.getItemName(im.MINOR, scode);
        System.out.println("商品コード: " + args[0]);
        System.out.println("大分類名: " + lname);
        System.out.println("小分類名: " + sname);
        System.out.println("詳細コード: " + details);

    }

}

//大分類・小分類コードと、それに対応する名称を保持するクラス
class Item {
    private String code;
    private String name;

    Item(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {return code;}
    public String getName() {return name;}
}


class ItemMaster {
    public int MAJOR = 0;
    public int MINOR = 1;
    private Item[][] items; //すべての項目を記録する二次配列

    ItemMaster(Item[] major, Item[] minor) { //majorにはli(大分類コード一覧), minorにはsi(小分類コード一覧)が格納
        items = new Item[2][]; //MAJOR=0 と MINOR=1 の2種類と決まっている
        items[MAJOR] =  major;
        items[MINOR] = minor;
    }

    public String getItemName(int codeLevel, String code){ //codeLevel  大分類か小分類の判別
        for (int i=0; i < items[codeLevel].length; i++){
            if (code.equals(items[codeLevel][i].getCode())){
                return items[codeLevel][i].getName();
            }
        }
        return "(不明)";
    }
}