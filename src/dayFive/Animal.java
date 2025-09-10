package dayFive;

public class Animal {

    //Inheritance: allows one class (child/subclass) to acquire the properties and methods of another class (parent/superclass).
    // Concepts: ParentClass -> base class && ChildClass -> class that inherits
    // Access modifiers => only public and protected are inherited, not private
    // Sub/Child => Reuse parent fields and methods && I can own my fields and methods
    // Java doesn't support multi-inheritances - Single inheritance => in future "Interface"
    // Override

    public void eat()
    {
        System.out.println("This animal eats food");
    }
}

