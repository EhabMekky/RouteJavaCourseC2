package dayThree;

import java.util.Scanner;

public class AddNumberDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean again = false;

        do {
            System.out.println("Enter first number");
            double num1 = scanner.nextDouble();
            System.out.println("Enter second number");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;
            System.out.println("The sum is: " + sum);

            System.out.println("Would you like to sum another numbers? \n Write Ture if you want to insert another number \n if not write False");
            again = scanner.nextBoolean();
            if (again == false)
            {
                System.out.println("Good bye! ;)");
            }
        }while (again);
    }
}
