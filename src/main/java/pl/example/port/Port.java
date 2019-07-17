package pl.example.port;

import pl.example.cruise.Cruise;

import java.util.ArrayList;
import java.util.List;

public class Port
{
    private Cruise cruise;
    private List<Cruise> cruiseList = new ArrayList<>();

       public Port(Cruise cruise)
    {
        this.cruise = cruise;
        this.cruiseList = cruiseList;
    }

    public void addCruise()
    {
        cruiseList.add(cruise);
    }
}
