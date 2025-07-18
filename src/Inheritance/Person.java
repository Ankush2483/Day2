package Inheritance;
//Create a Person class with private fields name and age. Use getters and setters to access them.
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name ) {
        this.name = name;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Person p = new Person("Ankush",20);
        System.out.println(p.getName());
        System.out.println(p.getAge());

    }
}
