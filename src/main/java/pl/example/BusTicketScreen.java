package pl.example;

import pl.example.ship.Ship;

import java.util.Scanner;

public class BusTicketScreen implements Screen
{
    private Ship ship;

    public BusTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        System.out.println("Enter your bus length");
        if (ship.getSpace() >= Bus.spaceUnit)
        {
            Bus bus = new Bus(length);
            Ticket ticket = new BusTicket(bus);
            ship.setSpace(ship.getSpace() - Bus.spaceUnit);
            ship.addBus(bus);
            System.out.println("Your bus ticket cost: " + ticket.getPrice());
        }

        return 0;
    }
}
