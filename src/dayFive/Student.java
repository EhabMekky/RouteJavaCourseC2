package dayFive;

public class Student {
    private  String name;
    private int grade;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade>0 && grade<100) {
            this.grade = grade;
        }
        else
        {
            System.out.println("Please, Enter value between 0 and 100");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
