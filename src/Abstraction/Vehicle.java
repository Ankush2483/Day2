package Abstraction;
//Create an abstract class Vehicle with an abstract method move().
// Implement Car and Bike with different movement logic.
abstract class Vehicle {
    abstract void  move();

}
class cars extends Vehicle {
    @Override
    public void move() {
        System.out.println(" car moves with  staring");
    }
}
class Bikes extends  Vehicle {
    @Override
    public void move() {
        System.out.println("Bike moves for balancing concepts");
    }
}
class Apply {
    public static void main(String[] args) {
        Vehicle v1 = new cars();
        v1.move();
        Bikes b1 = new Bikes();
        b1.move();
    }
}

