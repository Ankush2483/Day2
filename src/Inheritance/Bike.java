package Inheritance;
//Create a base class Vehicle with fields like speed and methods like start(). Extend it with Car and Bike.
public class Bike {
        protected int speed;
        public void start() {
            System.out.println("Bike is starting with a kick.");
        }
        public void speed(int s) {
            speed = s;
            System.out.println("Bike is running at: " + speed + " km/h");
        }
    }
    class Car extends Bike {
        @Override
        public void start() {
            System.out.println("Car is starting with a key.");
}
        @Override
        public void speed(int s) {
            speed = s;
            System.out.println("Car is running at: " + speed + " km/h");
        }
    }


