package Polymarphism;

public class Employee {
        protected String name;
        protected double salary;

        public Employee(String name, double salary) {
            this.name = name;
            this.salary = salary;
        }
        public double calculateBonus() {
            // 10% bonus for a regular employee
            return salary * 0.10;
        }

        public void displayInfo() {
            System.out.println("Employee: " + name);
            System.out.println("Salary  " + salary);
            System.out.println("Bonus " + calculateBonus());
        }
    }
    class Manager extends Employee {
        private double TPS;//TeamPerformanceScore

        public Manager(String name, double salary) {
            super(name, salary);
            this.TPS = TPS;
        }
        @Override
        public double calculateBonus() {
            // 15% bonus for a regular employee
            return salary * 0.15 + TPS * 500;
        }
    }


