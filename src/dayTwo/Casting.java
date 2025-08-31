package dayTwo;

public class Casting {

    public static void main(String[] args)
    {
        //Widening casting => convert smaller type to larger type
//        byte b = 10; // type byte
//        double i = b; // cast to integer
//        System.out.println(i);
//
//        if(i instanceof Double) {
//            System.out.println("double");
//        } else
//            System.out.println("Hamda");

//        int myInt = 50;
//        double myDouble = myInt;


        //Narrowing => Converting a larger type to a smaller

        double myDouble = 50.555;
        int myInt = (int) myDouble; //50
        System.out.println(myInt);

    }
}
