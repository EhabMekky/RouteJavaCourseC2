package dayFour;

import java.util.Scanner;

public class LetterSearch {
    //Program: Search to find a letter
    static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your full name:");
        String text = s.nextLine();
        s.close();
        boolean letterFound = false; //default boolean False => boolean value (0,1) 0=>false

        //index => Mohamed => m=0, o=1, h=2, d=6
        for(int i=0; i<text.length(); i++)
        {
            char currentLetter = text.charAt(i);
            if(currentLetter=='A' || currentLetter=='a')
            {
                letterFound = true;
                break;
            }
        }
        if (letterFound) //true
            System.out.println("This name contain Letter A");
        else
            System.out.println("This name doesn't contain Letter A");
    }
}
