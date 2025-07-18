package D52;

public class D52ensyu {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.bark();

        Horse horse = new Horse();
        horse.bark();
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
