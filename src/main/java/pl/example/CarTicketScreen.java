package pl.example;

import pl.example.ship.Ship;

import java.util.Scanner;

public class CarTicketScreen implements Screen
{
    private Ship ship;

    public CarTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        if (ship.getSpace() >= Car.spaceUnit) //TODO dodanie samochodu na listę rejsów?
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your name: ");
            String name = scanner.next();
            System.out.println("Enter your surname: ");
            String surname = scanner.next();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();

            Humane humane = new Humane(age, name, surname);
            //Ticket ticket = new HumaneTicket(humane);

            Car car = new Car();
            car.addPassenger(humane);
            Ticket ticket = new CarTicket(car);
            ship.setSpace(ship.getSpace() - Car.spaceUnit);
            ship.addCar(car);
            System.out.println("Your car ticket cost: " + ticket.getPrice());
        }
        else
        {
            System.out.println("Not enough space");
        }
        return 0;
    }
}
