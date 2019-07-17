package pl.example.cruise;

import pl.example.ship.Ship;

public class Cruise
{
    private Ship ship;
    private String destination;

    public Cruise(Ship ship, String destination)
    {
        this.ship = ship;
        this.destination = destination;
    }
}
