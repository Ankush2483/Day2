package Encasulation;
//Design a Student class with private fields for name, rollNumber, and marks
// Add validation in the setters (e.g., marks must be 0–100).
 class Student {
    private String name;
    private int rollNumber;
    private int marks;
      public String getName(){
          return name;
      }
      public void setName(String name){
          if (name != null){
          this.name = name;
          }
          else{
              System.out.println("null vale not allowed ");
          }
      }
    public int getMarks() {
        return marks;
    }
    public void setMarks(int marks) {
          if (marks > 0 && marks <= 100){
          this.marks = marks;
          }
          else{
              System.out.println("marks not allowed ");
          }
    }
    public int getRollNumber() {
          return rollNumber;
    }
    public void setRollNumber(int rollNumber) {
          if (rollNumber !=0 ){
              this.rollNumber = rollNumber;
          }
          else{
              System.out.println("roll number not allowed ");
          }
    }
}
class Erp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Ankush");
        s1.setRollNumber(1);
        s1.setMarks(80);
        System.out.println("name:"+s1.getName());
        System.out.println("roll:"+s1.getRollNumber());
        System.out.println("marks:"+s1.getMarks());

    }
}



