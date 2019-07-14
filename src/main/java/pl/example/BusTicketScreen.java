package pl.example;

import java.util.Scanner;

public class BusTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Enter your bus length");
        Bus bus = new Bus(length);
        Ticket ticket = new BusTicket(bus);
        System.out.println("Your bus ticket cost: " + ticket.getPrice());
        return 0;
    }
}
