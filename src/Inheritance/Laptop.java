package Inheritance;
//Create a Laptop class and extend it with a GamingLaptop that adds extra features like enableRGB().
public class Laptop {
    public void start() {
        System.out.println("Laptop is starting...");
    }
}
class GamingLaptop extends Laptop {
    public void enableRGB() {
        System.out.println("RGB lighting enabled on Gaming Laptop!");
    }
}

class LaptopTest {
    public static void main(String[] args) {
        Laptop myLaptop = new GamingLaptop();
        myLaptop.start();

    }
}

