interface Animal {
    void eat();
    void sleep();
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish");
    }

    public void sleep() {
        System.out.println("Cat sleeps in a cozy spot");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.eat();
        cat.sleep();
    }
}
