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

    public void print()
    {
        System.out.println("Hello, I'm " + name + " I'm " + age + " years old");
    }

    public void prints()
    {
        System.out.println("Hello, I'm " + name + " I'm " + age + " years old " + "my gender is " + gender);
    }


    //        System.out.println("Hello, i'm " + p3.name + " ,I'm " + p3.age + " years old");

    /*
    Interactive Activity
Ask them to design a Car class:
Attributes: brand, model, year
Write both a default and a parameterized constructor
Instantiate 3 car objects and print their details
     */
}
