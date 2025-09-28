package dayNine;

public class Person {

    //super => keyword refer to parent class
    /*
    1. **Access parent class variables (if hidden by subclass variables).
    2. **Call parent class methods (if overridden).
    3. **Call parent class constructor from the child constructor.
     */

    //Access Parent Variables
    String role = "Person";

    //Call Parent Methods
    void personJob()
    {
        System.out.println("Person Job from Parent Class" );
    }

    //Call Parent Constructor
    Person() {}

    Person(String name)
    {
        System.out.println("Person Constructor called " + name);
    }
}
