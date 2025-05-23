package D48;

public class D48Q25 {
    String code;

    public static void main(String[] args) {
        D48Q25 obj = new D48Q25();
        obj.setCode("FB1257");
        System.out.println(obj.getCode());
    }

    void setCode(String s) {
        code = s;
    }

    String getCode() {
        return code;
    }
}
