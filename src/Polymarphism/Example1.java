package Polymarphism;
// Overload a print() method in a class to handle int, String, and double inputs.
class Example1{
    public void print(int x,int  y){
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
    public void print(int x,double y){
        System.out.println("x="+x);
        System.out.println("y="+y);

    }
    public void print(String str){
        System.out.println("str =" +str);
    }

    public static void main(String[] args) {
        Example1 e = new Example1();
        e.print(10,20);
        e.print(10,20.5);
        e.print("Hello");
    }
}
