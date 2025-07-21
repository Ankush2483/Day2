package Abstraction;
//Define an interface Shape with a method calculateArea().
// Implement Circle and Rectangle classes that implement this interface.

interface shape {
    void calculateArea();

}
class Circle implements shape {
    @Override
    public void calculateArea() {
        int radius = 5;
        System.out.println("Area of circle is " + 3.14 *5*5);
    }
}

class Rectangle implements shape {
    @Override
    public void calculateArea() {
        int width = 5;
        int length = 8;
        System.out.println("Area of Rectangle is " + width*length);
    }
}
class test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();
        circle.calculateArea();
        rectangle.calculateArea();

    }
}