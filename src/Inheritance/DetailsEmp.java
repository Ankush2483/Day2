package Inheritance;

import javax.imageio.stream.ImageInputStream;

public class DetailsEmp {
    void details() {
        String name ;
        int age;
    }

}
class Employee1 extends DetailsEmp {
    void details() {
        String name = "Ankush";
        int age = 20;
        int salary = 50000;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}
class Emp{
    public static void main(String[] args) {
        DetailsEmp D1 = new Employee1();
        D1.details();

    }
}
