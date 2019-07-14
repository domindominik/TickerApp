package pl.example;

import pl.example.exception.NotEnoughSpace;
import pl.example.ship.Ship;

import java.util.Scanner;

public class HumaneTicketScreen implements Screen
{
    private Ship ship;

    public HumaneTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your surname: ");
        String surname = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        Humane humane = new Humane(age, name, surname);
        Ticket ticket = new HumaneTicket(humane);

        if (age < 18)
        {
            if (ship.getSpace() >= 5)
            {
                ship.setSpace(ship.getSpace() - 5);
            }
            else
            {
                System.out.println("Not enough space");
            }
        }
        else
        {
            if (ship.getSpace() >= 10)
            {
                ship.setSpace(ship.getSpace() - 10);
            }
            else
            {
                System.out.println("Not enough space");
            }
        }
        ship.addHuman(humane);
        humane.setPrice(ticket.getPrice());

        System.out.println("Your ticket cost: " + ticket.getPrice());
        return 0;
    }
}

// osobna klasa do dodawania ludzi do wycieczki. zrzucanie wyjątku.