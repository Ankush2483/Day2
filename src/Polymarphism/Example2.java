package Polymarphism;
//Create a method calculateArea(Shape s) that accepts
// any subclass of Shape and invokes its specific implementation.
 class Example2 {
    void Mm(){
        System.out.println("Mesuerment");
    }
}
class calculate extends Example2{
     void Mm(){
         int r = 11;
         System.out.println("calculate area of circle" +3.14*r*r);
     }
}
class calc extends Example2{
     void Mm(){
         int width = 10;
         int length = 15;
         System.out.println("calc area of Rectangle " +width*length);
     }
}
 class sub {
     public static void main(String[] args) {
         Example2 e = new calc();
         e.Mm();
         Example2 e2 = new calculate();
         e2.Mm();
     }
 }
