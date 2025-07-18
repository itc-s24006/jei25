package D52;

public class D52ensyu {
    public static void main(String[] args) {
        Animal tama = new Cat();
        tama.bark();

        Animal ao = new Horse();
        ao.bark();
    }
}

class Animal {
    public void bark(){
    }
}

class Cat extends Animal {
    public void bark(){
        System.out.println("nya-");
    }
}

class Horse extends Animal {
    public void bark(){
        System.out.println("hihi-n");
    }
}
