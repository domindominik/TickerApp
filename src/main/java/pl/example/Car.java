package pl.example;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable
{
    public static final int spaceUnit = 30;

    public Car()
    {
        super();

    }

    public int getSpaceUnit()
    {
        return spaceUnit;
    }
}
