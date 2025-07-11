package D51;

public class D51Ensyu {
    public static void main(String[] args) {
        D51Student s1 = new D51Student(args[0], args[1]);

        System.out.println("学生番号: " + s1.getStudentId());
        System.out.println("氏名: " +s1.getName());
    }
}

class D51Student {
    private String studentId;
    private String name;

    public D51Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    //privateフィールドだからゲッター作成
    public String getStudentId() {return studentId;}
    public String getName() {return name;}
}

