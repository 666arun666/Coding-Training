abstract class Animal {
    abstract void sound();
    void eat() {
        System.out.println("Animal eats food.");
    }
}
class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks.");
    }
}
class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows.");
    }
}
class Cow extends Animal {
    void sound() {
        System.out.println("Cow moos.");
    }
}
public class animalsound {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();

        Cat cat = new Cat();
        cat.sound();
        cat.eat();

        Cow cow = new Cow();
        cow.sound();
        cow.eat();
    }
}
