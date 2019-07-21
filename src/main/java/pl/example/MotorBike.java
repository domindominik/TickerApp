package pl.example;

import java.io.Serializable;

public class MotorBike extends  Vehicle implements Serializable
{
    public static final int spaceUnit = 15;

    public MotorBike()
    {

    }

    public static int getSpaceUnit()
    {
        return spaceUnit;
    }
}
