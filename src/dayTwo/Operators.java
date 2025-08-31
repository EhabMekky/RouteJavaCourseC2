package dayTwo;

import java.sql.SQLOutput;

public class Operators {
    public static void main(String[] args) {
        //arithmetic
//        int a = 10; double b = 5.5;
//        double sum = a + b; // compile
//        System.out.println(sum); //15.5
//        System.out.println(a+b); //15.5 // run
//        System.out.println(a*b); //55
//        System.out.println(a/b); //1.8
//        System.out.println(a%b); //4.5

        // relational => true & false
//          int r = 20, t = 25;
//        System.out.println(r > t); // false
//        System.out.println(r < t); // true
//          int l = 12, k = 12;
//        System.out.println(l >= k); // true
//        System.out.println(l >= r); // false
//        System.out.println(l <= r); // true
//        System.out.println(l == r); // false
//        System.out.println(l == k); // true
//
//        System.out.println(r != t); //true
//        System.out.println(l != k); //false



      //Logical operators      &&     ||      !
//         boolean lora = false, amin = false;
//        System.out.println(lora&&amin); //false
//          boolean roqaya = true, salwa = true;
//        System.out.println(roqaya&&salwa); //true
//          boolean gehad = true, abdelrahman = false;
//        System.out.println(gehad||abdelrahman); //ture
//        System.out.println(!gehad); // false
//        System.out.println(!abdelrahman); // true
//
//        boolean b1 = 10>20; // false
//        boolean b2 = 20>10; // ture
//        System.out.println(b1||b2); // true
//        System.out.println(b1&&b2); // false


        //increment ++ AND decrement -- operators //compile
//         int  a = 10;
//         int increment = a++; //post increment
//        System.out.println(increment); //10 //run time
//        System.out.println(a); //11 // run time
//
//        int preIncrement = ++a; //12
//        int postIncrement = a++;
//        System.out.println(preIncrement); //12
//        System.out.println(postIncrement); //12

//        int a = 10;
//        int decrement = a--; //10
//        System.out.println(decrement);
//        System.out.println(a); //

        // Assignment

      // int x = 10; int y = 20;    // swap

//        int temp = x;  // store x (10) in temp
//        x = y;         // assign y (20) to x
//        y = temp;      // assign temp (10) to y

       // System.out.println("x = " + x); // 20
       // System.out.println("y = " + y); // 10

//        x = x ^ y;
//        y = x ^ y;
//        x = x ^ y;
//        System.out.println("x = " + x); // 20
//        System.out.println("y = " + y); //10


        //Assignment Operators
//        int x = 10;
//        //x = x + 10; // 20
//        System.out.println(x); //10
//        // x += 10; //short hand
//        System.out.println("NEW X Value is: " + x); //20
//        x = x - 9;
//        x -= 9;
//        x = x * 1;
//        x*=1;
//        x/=2;
//        x%=3;


        //solve use ternary
//        int a = 10; int b = 15;
//        if(a >= b)
//            System.out.println("Hello ya basha");
//        else
//            System.out.println("El basha tlmiz");

        int a = 20, b = 10, c;
        if(a < b)
            System.out.println("a is greater than b");
        else
            System.out.println("a is not greater than b");

        System.out.println(a > b ? "ok" : "No"); //ternary

        if(a>b)
            c=a;
        else
            c=b;
        System.out.println(c); // Value = 20


        c = (a>b)?a:b;
        System.out.println(c);

//        if(a == b)
//        {
//            System.out.println();
//        }
//        else
//        {
//            System.out.println();
//        }
    }
}
