package dayEight;

abstract class Shape {

    //Abstraction = hiding implementation details and showing only the essential behavior.
    //Focus on what the object does instead of how it does it.

    abstract void draw(); //abstract method - has nobody - must exist in an abstract class

    void info()
    {   //concrete method
        System.out.println("I am Shape class");
    }
}
