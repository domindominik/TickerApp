package pl.example.cruise;

import pl.example.ship.Ship;

import java.io.Serializable;

public class Cruise implements Serializable
{
    private Ship ship;
    private String destination;

    public Cruise(Ship ship, String destination)
    {
        this.ship = ship;
        this.destination = destination;
    }
}
