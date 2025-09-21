package daySix;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Month.getMonth("POL"));
//        System.out.println(Month.getMonth(13));

//        InstantPayCheck payCheck = new InstantPayCheck();
//
//       double salary = payCheck.getSalary();
//       int score = payCheck.getScore();
//       boolean isQualified = payCheck.isQualified(salary,score);
//       payCheck.notifyUser(isQualified);

        //int[] numbers = {10,20,30,40,50}; //5
//        System.out.println(numbers[0]);
//        System.out.println(numbers[2]);
           //   System.out.println(numbers[6]); invalid index

//
//        numbers[0] = 5;
//        System.out.println(numbers[0]);
//
//        int a[] = new int[6];
//            a[0] = 5;
//            a[1] = 10;
//            a[2] = 15;
//            a[3] = 20;
//            a[4] = 25;
//            a[5] = 30;
//
//        System.out.println(a[3]);
//        System.out.println("Array Length is: " + numbers.length);
//
//        for(int i=1;i<numbers.length;i++)
//        {
//            System.out.println(numbers[i]);
//        }


//        Student[] students = new Student[3];
//        students[0] = new Student("Hazem", 99);
//        students[1] = new Student("Salwa", 95);
//        students[2] = new Student("Ameer", 90);
//
//        //students[0].printInfo();
//        for(int i=0;i< students.length;i++)
//        {
//            students[i].printInfo();
//        }
//
//        //Enhanced for loop -- don't use often
//        System.out.println("Using Enhanced for loop");
//        for(Student student : students)
//        {
//            student.printInfo();
//        }

//       int[] ticket = LotteryTicket.generateTicketNumbers();
//       LotteryTicket.printTicket(ticket);

        //Linear Search -- add in new class, please.
        String target;
        Scanner scanner = new Scanner(System.in);
        String[] fruits = {"Apple", "Banana", "Orange", "Mango", "Grapes"};
        boolean isFound = false;
        System.out.println("Enter the fruit to search for: ");
        target = scanner.nextLine();
        for(int i=0;i< fruits.length;i++) //Searching for target by looping through the array using memory address
        {
            if(fruits[i].equals(target))
            {
                System.out.println(target + " found at index " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound)
        {
            System.out.println(target + " not found in the array");
        }
    }
}
