package Polymarphism;

public class Animal {
    String name;
    public void sound() {
        System.out.println(name + " makes a sound.");
    }
}
class Dog extends Animal {
    String breed;

    public Dog(String name) {
        this.name = name;
        System.out.println(name);
    }

    @Override
    public void sound() {
        // Overridden method in Dog
        System.out.println(name + " barks.");
    }
}

class main{
    public static void main(String[] args) {
        Animal a = new Dog("jaci");
        a.sound();



    }
}

