package pl.example;

import java.io.Serializable;

public class Bus extends Vehicle implements Serializable
{
    private int length;
    public static final int spaceUnit = 60;


    public Bus(int length)
    {
        this.length = length;
    }

    public int getLength()
    {
        return length;
    }

    public void setLength(int length)
    {
        this.length = length;
    }

    public int getSpaceUnit()
    {
        return spaceUnit;
    }
}
