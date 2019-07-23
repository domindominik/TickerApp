package pl.example;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable
{
    public static final int spaceUnit = 30;

    public Car()
    {
        super();
    }

    public int getSpaceUnit() // czy mogę tę metodę przenieść do klasy Vehicle?
    {
        return spaceUnit;
    }
}
