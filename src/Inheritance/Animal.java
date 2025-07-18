package Inheritance;
//Make a Bird class that extends Animal and inherits the method eat(), while adding a new method fly().
public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}
class Bird extends Animal {
    public void eat() {
        System.out.println("Birds is eating.");
    }
    public void fly() {
        System.out.println("Birds flying.");
    }
}

class AnimalTest {
    public static void main(String[] args) {
        Bird myBird = new Bird();
        myBird.eat();
        myBird.fly();
    }
}
