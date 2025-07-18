package Inheritance;
    public class VehicleTest {
        public static void main(String[] args) {
            Bike myBike = new Bike();
            myBike.start();
            myBike.speed(40);

            System.out.println();

            Car myCar = new Car();
            myCar.start();
            myCar.speed(100);
        }
    }
