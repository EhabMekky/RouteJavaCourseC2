package dayEight;

public class Zoo {
    public static void main(String[] args) {
//        MathUtils mathUtils = new MathUtils(); // compile time polymorphism
//        System.out.println(mathUtils.add(5.5,5)); //call int version
//        System.out.println(mathUtils.add(5.5,5)); //call double version



        Animal a1 = new Dog(); // runtime polymorphism
        Animal a2 = new Cat(); // runtime polymorphism

        a1.sound(); // Dog barks
        a2.sound(); // Cat meows

        /*
        ### **Hands-on Activity**

- Create a parent class `Shape` with method `draw()`.
- Subclasses: `Circle`, `Square`, `Triangle` each override `draw()`.
- Store them in an array `Shape[] shapes = {new Circle(), new Square(), new Triangle()};`
- Loop and call `draw()` → different output for each.
         */
    }
}
