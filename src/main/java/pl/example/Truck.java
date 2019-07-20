package pl.example;

import java.io.Serializable;

public class Truck extends Vehicle implements Serializable
{
    private int weight;
    public static final int spaceUnit = 60;


    public Truck(int weight)
    {
        this.weight = weight;
    }

    public int getWeight()
    {
        return weight;
    }
}
