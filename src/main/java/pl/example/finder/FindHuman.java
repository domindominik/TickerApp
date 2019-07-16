package pl.example.finder;

import pl.example.Humane;
import pl.example.ship.Ship;

import java.util.ArrayList;
import java.util.List;

public class FindHuman
{
    private Ship ship;
    private List<Humane> result = new ArrayList<>();

    public FindHuman(Ship ship)
    {
        this.ship = ship;
        this.result = result;
    }

    public void findHuman(String name)
    {
        for (Humane humane: ship.getHumaneList())
        {
            if (name.equals(humane.getName()) || name.equals(humane.getSurname()))
            {
                result.add(humane);
            }
        }
        System.out.println(result.toString());
    }
}
