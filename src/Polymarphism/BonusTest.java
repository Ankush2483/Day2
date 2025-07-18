package Polymarphism;

public class BonusTest {
        public static void main(String[] args) {
            Employee emp = new Employee("Ankush", 50000);
            Manager mgr = new Manager("Ayush", 80000);
            emp.displayInfo();
            System.out.println();
            mgr.displayInfo();
        }
    }
