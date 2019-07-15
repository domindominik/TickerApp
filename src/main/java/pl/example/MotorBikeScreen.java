package pl.example;

import pl.example.ship.Ship;

public class MotorBikeScreen implements Screen
{
    private Ship ship;

    public MotorBikeScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        if (ship.getSpace() >= 15)
        {
            MotorBike motorBike = new MotorBike();
            Ticket ticket = new MotorBikeTicket(motorBike);
            ship.setSpace(ship.getSpace() - 15);
            ship.addMotorBike(motorBike);
            System.out.println("Your moto bike ticket cost: " + ticket.getPrice());
        }

        return 0;
    }
}
