package Polymarphism;
//Create a Shape class with a method draw(). Override it in Circle, Square, and Triangle.
public class Shape {
      void draw() {
        System.out.println("Draw");
    }

}
    class Circle extends Shape{
        public void draw(){
            System.out.println("circle");
        }
    }
      class Rectangle extends Circle{
        public void draw(){
            System.out.println("rectangle");
        }


        public static void main(String[] args) {
          Shape s = new Rectangle();
            s.draw();
            Shape s1 = new Circle();
            s1.draw();

        }
    }

