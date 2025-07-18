package Collection;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayEx{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name,surname,age,id :");
        String name = sc.next();
        String upperCase = name.toUpperCase();
        String surname = sc.next();
        String lowerCase = surname.toLowerCase();
        String age = sc.next();
        String id = sc.next();

        ArrayList<String> list = new ArrayList<>();
        list.add(name);
        list.add(surname);
        list.add(age);
        list.add(id);

        System.out.println(list);
    }

}
