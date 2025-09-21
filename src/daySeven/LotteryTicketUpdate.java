package daySeven;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicketUpdate {
    private static final int LENGTH=6; //Global Variable
    private static final int MAX_TICKET_NUMBER=69;

    public static int[] generateTicketNumbers()
    {
        int [] ticket = new int [LENGTH];
        Random random = new Random();
        for(int i=0;i<LENGTH; i++){
            int randomNumber;
            do{
                randomNumber= random.nextInt(MAX_TICKET_NUMBER);
            }while (binarySearch(ticket,randomNumber));
            ticket[i]=randomNumber;
        }
        return ticket;
    }

    public static void printTicket(int [] ticket) {
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(ticket[i] + " | ");
        }
    }

    public static boolean search(int[] array, int numberToSearchFor)
    {
        for(int value: array)
        {
            if(value==numberToSearchFor){
                return true;
            }
        }
        return false;
    }


    public static boolean binarySearch(int[] array,int numberToSearchFor) {
        int index = Arrays.binarySearch(array, numberToSearchFor);
        return index >= 0;
    }
}
