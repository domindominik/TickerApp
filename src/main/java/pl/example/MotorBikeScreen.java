package pl.example;

import pl.example.ship.Ship;

import java.util.Scanner;

public class MotorBikeScreen implements Screen
{
    private Ship ship;

    public MotorBikeScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        if (ship.getSpace() >= MotorBike.spaceUnit)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your surname: ");
            String surname = scanner.next();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            Humane humane = new Humane(age, name, surname);

            MotorBike motorBike = new MotorBike();
            motorBike.addPassenger(humane);
            Ticket ticket = new MotorBikeTicket(motorBike);
            ship.setSpace(ship.getSpace() - MotorBike.spaceUnit - 10);

            ship.addMotorBike(motorBike);
            System.out.println("Your moto bike ticket cost: " + ticket.getPrice());
        }

        return 0;
    }
}
