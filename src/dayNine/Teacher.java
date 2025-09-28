package dayNine;

public class Teacher extends Person{
    String role = "Teacher";
    private String name;
    void printRole()
    {
        System.out.println(role); // access current class variable => Teacher
        System.out.println(super.role); // access parent class variable => Person
    }


    void personJob()
    {
        System.out.println("Teacher Job from Child Class" ); // current class method
        super.personJob(); // call parent class method
    }

    Teacher() {}

    Teacher(String name)
    {
        super("Fady");
        this.name = name; // invalid => use another constructor to initialize name
        System.out.println("Teacher Constructor called " + name);
    }
}
