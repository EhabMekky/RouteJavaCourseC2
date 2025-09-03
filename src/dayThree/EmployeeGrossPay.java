package dayThree;

import java.util.Scanner;

public class EmployeeGrossPay {
    public static void main(String [] args)
    {
        int rate = 15;
        int maxWeeklyHours = 40;

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your weekly hours");
        double empWeeklyHours = s.nextDouble();

        while (empWeeklyHours > maxWeeklyHours || empWeeklyHours <= 0)
        {
            System.out.println("Invalid entry. please enter between 1h to 40h");
            System.out.println("Enter your weekly hours: ");
            empWeeklyHours = s.nextDouble();
        }

        double grossSalary = empWeeklyHours*rate;
        System.out.println("Your weekly gross salary is " + grossSalary+"$");
    }
}
