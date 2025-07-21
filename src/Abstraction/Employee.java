package Abstraction;
//Create an abstract class Employee with an abstract method getSalary().
// Implement FullTimeEmployee and PartTimeEmployee.
abstract class Employee {
    abstract void getSalary();
}
class FullTimeEmployee extends Employee {

    @Override
    void getSalary() {
        System.out.println("full time Employee getSalary");
    }
}
class PartTimeEmployee extends Employee {
    @Override
    void getSalary() {
        System.out.println("part time Employee getSalary");
    }
}
class Test2 {
    public static void main(String[] args) {
    Employee e = new FullTimeEmployee();
    e.getSalary();
    Employee e2 = new PartTimeEmployee();
    e2.getSalary();

    }
}
