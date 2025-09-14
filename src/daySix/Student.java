package daySix;

 public class Student {
     private String name;
     private int grade;

     //Setters
     Student(String name, int grade) {
         this.name = name;
         this.grade = grade;
     }

        //Getters
     public String getName() {
         return name;
     }

     public int getGrade() {
         return grade;
     }

     // Set method call inside constructor
     public void setGrade(int grade)
     {
         if (grade >= 0 && grade <=100){
             this.grade = grade;
         } else {
             System.out.println("Invalid grade.");
         }
     }

     public void printInfo()
     {
         System.out.println("Name: " + name + ", Grade: " + grade);
     }

}
