package Polymarphism;
//Implement method overriding in a class hierarchy: Employee → Manager,
// where calculateBonus() behaves differently.
public class Employee {
    void calculateBonus(){
        System.out.println("calculate employee  bonus ");
        int salary = 20000;
        int bonus = 200;
        int totalSalary = salary + bonus;
        System.out.println("Employee Total Salary: " + totalSalary);
    }
}
class Manager extends Employee{
    @Override
    void calculateBonus(){
        System.out.println("calculate manger bonus ");
        int salary = 50000;
        int bonus = 1000;
        int totalSalary = salary + bonus;
        System.out.println("manager  Total Salary: " + totalSalary);

    }
}
class Bonus {
    public static void main(String[] args) {
        Employee e = new Manager();
        e.calculateBonus();

    }
}