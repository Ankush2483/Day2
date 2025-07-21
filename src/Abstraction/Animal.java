package Abstraction;
//Create an abstract class Animal with an abstract method makeSound().
// Implement classes like Dog and Cat that extend Animal and override the sound.
 abstract class Animal {
    abstract void  MakeSound();

}
class Cat extends Animal {

    @Override
    void MakeSound() {
        System.out.println("I'm a cat");
    }
}
class Dog extends Animal {
    @Override
    void MakeSound() {
        System.out.println("I'm a dog");
    }
}
class Test1{
     public static void main(String[] args) {
         Animal a = new Cat();
         a.MakeSound();
         Animal b = new Dog();
         b.MakeSound();

     }
}
