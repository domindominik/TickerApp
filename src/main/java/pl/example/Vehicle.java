package pl.example;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle
{
    private List<Humane> passengerList = new ArrayList<>();

    public Vehicle() //
    {
        this.passengerList = passengerList;
    }

    public List<Humane> getPassengerList()
    {
        return passengerList;
    }

    public void setPassengerList(List<Humane> passengerList)
    {
        this.passengerList = passengerList;
    }

    public void addPassenger(Humane humane)
    {
        passengerList.add(humane);
    }


    // dodać kierowcę oraz metody pozwalające na wyświetlenie kierowcy.
    /*public abstract Humane getDriver();
    public abstract void setDriver();
    */
    //dodać pola kierowca
}
