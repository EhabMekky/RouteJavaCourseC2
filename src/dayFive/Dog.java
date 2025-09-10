package dayFive;

public class Dog extends Animal
{
    public void bark()
    {
        System.out.println("The dog barks");
    }

    @Override
    public void eat()
    {
        System.out.println("The dog eats bones.");
    }

    /*
    - Create a `Vehicle` superclass:
    - Fields: `brand`, `year`
    - Method: `start()` prints `"Vehicle started"`.
- Create subclasses:
    - `Car` adds method `honk()`.
    - `Bike` adds method `ringBell()`.
- Instantiate both and demonstrate inherited + own methods.
     */
}
