package daySix;

import java.util.Scanner;

public class InstantPayCheck {
    double requiredSalary = 25000;
    int requiredScore = 700;
    Scanner s = new Scanner(System.in);

    public double getSalary()
    {
        System.out.println("Enter your salary, please.");
        double salary = s.nextDouble();
        return salary;
    }

    public int getScore()
    {
        System.out.println("Enter your I score, please.");
        int score = s.nextInt();
        return score;
    }

    public boolean isQualified(double salary, int score)
    {
        if(salary>=requiredSalary&&score>=requiredScore)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void notifyUser(boolean isQualified)
    {
        if(isQualified)
        {
            System.out.println("Congrats, you are qualified for the loan.");
        }
        else
        {
            System.out.println("Sorry, you are not qualified for the loan.");
        }
    }

    /*
    3
    2
    1
    Happy New Year!!
     */
}
