package pl.example;

import pl.example.ship.Ship;

import java.util.Scanner;

public class TruckTicketScreen implements Screen
{
    private Ship ship;

    public TruckTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in T");
        int weight = scanner.nextInt();

        if (ship.getSpace() >= Truck.spaceUnit)
        {
            Truck truck = new Truck(weight);
            Ticket ticket = new TruckTicket(truck);
            ship.setSpace(ship.getSpace() - Truck.spaceUnit);
            ship.addTruck(truck);
            System.out.println("Your truck ticket cost: " + ticket.getPrice());
        }
        else
        {
            System.out.println("Not enough space");
        }
        return 0;
    }
}
