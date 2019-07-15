package pl.example;

import pl.example.ship.Ship;

public class CarTicketScreen implements Screen
{
    private Ship ship;

    public CarTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        if (ship.getSpace() >= 30)
        {
            Car car = new Car();
            Ticket ticket = new CarTicket(car);
            ship.setSpace(ship.getSpace() - 30);
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
