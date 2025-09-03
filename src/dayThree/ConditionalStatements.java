package dayThree;

import java.util.Scanner;

public class ConditionalStatements {

    public static void main (String[] args)
    {
        //Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter your age: ");
//        int studentAge = scanner.nextInt();
//        scanner.close();
        //System.out.println("Student Age is: " + studentAge);
        //String status = studentAge>18?"eligible":"don't be here";
        //System.out.println(status);

//        if(studentAge >= 18) {
//            System.out.println("Eligible for vote");
//        }
//        else {
//            System.out.println("Not eligible for vote");
//        }

        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number to figure if even or odd");
//        int number = scanner.nextInt();
//        scanner.close();
//        if(number%2==0)
//        {
//            System.out.println("the number " + number + " is even");
//        }
//        else
//        {
//            System.out.println("the number " + number + " is odd");
//        }

//        System.out.println("Enter a number to decide positive or negative or zero");
//        int number = scanner.nextInt();
//
//        if(number > 0)
//        {
//            System.out.println("Positive");
//        }
//        else if(number < 0)
//        {
//            System.out.println("Negative");
//        }
//        else
//        {
//            System.out.println("Zero");
//        }

//        System.out.println("Enter 1st number");
//        int firstNum = scanner.nextInt();
//        System.out.println("Enter 2nd number");
//        int secondNum = scanner.nextInt();
//        System.out.println("Enter 3rd number");
//        int thirdNum = scanner.nextInt();
//
//        if(firstNum>secondNum&&firstNum>thirdNum)
//        {
//            System.out.println("The 1st number is the biggest");
//        }
//        else if(secondNum>firstNum && secondNum>thirdNum)
//        {
//            System.out.println("The 2nd number is the biggest");
//        }
//        else
//        {
//            System.out.println("The 3rd number is the biggest");
//        }


        System.out.println("Enter the day number: ");
        int dayNumber = scanner.nextInt();

//        if (dayNumber == 1)
//            System.out.println("Sun");
//        else if(dayNumber == 2)
//            System.out.println("Mon");
//        else if(dayNumber == 3)
//            System.out.println("Tue");
//        else if(dayNumber == 4)
//            System.out.println("Wed");
//        else if(dayNumber == 5)
//            System.out.println("Thu");
//        else if(dayNumber == 6)
//            System.out.println("Fri");
//        else if(dayNumber == 7)
//            System.out.println("Sat");
//        else
//            System.out.println("Invalid number. Enter from 1 to 7, plz.");


        switch (dayNumber)
        {
            case 1:
                System.out.println("Sun");
                break;
            case 2:
                System.out.println("Mon");
                break;
            case 3:
                System.out.println("Tue");
                break;
            case 4:
                System.out.println("Wed");
                break;
            case 5:
                System.out.println("Thu");
                break;
            case 6:
                System.out.println("Fri");
                break;
            case 7:
                System.out.println("Sat");
                break;
            default:
                System.out.println("Invalid number. Enter from 1 to 7, plz.");
        }
    }
}
