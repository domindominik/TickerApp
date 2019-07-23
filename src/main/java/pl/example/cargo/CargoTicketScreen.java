package pl.example.cargo;

import pl.example.Screen;
import pl.example.Ticket;
import pl.example.ship.Ship;

import java.util.Scanner;

public class CargoTicketScreen implements Screen
{
    private Ship ship;

    public CargoTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cargo volume");
        int volume = scanner.nextInt();

        if (ship.getSpace() >= volume * Cargo.spaceUnit)
        {
            ship.setSpace(ship.getSpace() - (volume * Cargo.spaceUnit));
            Cargo cargo = new Cargo(volume);
            Ticket ticket = new CargoTicket(cargo);
            cargo.setPrice(ticket.getPrice());
            ship.addCargo(cargo);
            System.out.println("Your cargo ticket cost: " + ticket.getPrice());
        }
        else
        {
            System.out.println("Not enough space");
        }

        return 0;
    }
}
