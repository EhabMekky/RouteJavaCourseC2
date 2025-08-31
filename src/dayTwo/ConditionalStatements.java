package dayTwo;

import java.util.Scanner;

public class ConditionalStatements {
    public void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int studentAge = scanner.nextInt();
        scanner.close();
        System.out.println("Student Age is: " + studentAge);
        String status = studentAge>18?"eligible":"don't be here";
        System.out.println(status);
    }
}
