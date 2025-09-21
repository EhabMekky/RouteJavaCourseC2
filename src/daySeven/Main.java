package daySeven;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] ticket = LotteryTicketUpdate.generateTicketNumbers();
        LotteryTicketUpdate.printTicket(ticket);
        Arrays.sort(ticket);
        System.out.print("Sorted Tickets:");
        LotteryTicketUpdate.printTicket(ticket);
    }
}
