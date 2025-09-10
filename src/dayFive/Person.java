package dayFive;

public class Person {
    String name;
    int age;
    char gender;

    //Constructor
    Person()
    {
        System.out.println("I'm the default constructor");
    }

    Person(String n, int a)
    {
        name = n;
        age = a;
    }

    Person(String name, int age, char gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    /*
    Interactive Activity
Ask them to design a Car class:
Attributes: brand, model, year
Write both a default and a parameterized constructor
Instantiate 3 car objects and print their details
     */
}
