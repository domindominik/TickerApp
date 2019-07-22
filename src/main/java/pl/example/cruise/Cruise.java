package pl.example.cruise;

import pl.example.ship.Ship;

import java.io.Serializable;

public class Cruise implements Serializable
{
    private Ship ship;
    private String destination;

    //public Cruise(Ship ship, String destination)
    public Cruise()
    {
        this.ship = ship;
        this.destination = destination;
    }

    public Ship getShip()
    {
        return ship;
    }

    public String getDestination()
    {
        return destination;
    }

    public void setShip(Ship ship)
    {
        this.ship = ship;
    }

    public void setDestination(String destination)
    {
        this.destination = destination;
    }
}
