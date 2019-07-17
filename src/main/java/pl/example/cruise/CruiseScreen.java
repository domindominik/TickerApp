package pl.example.cruise;

import pl.example.Screen;
import pl.example.ship.Ship;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CruiseScreen implements Screen
{
    private Cruise cruise;
    private List<Cruise> cruiseList = new ArrayList<Cruise>();

    public CruiseScreen(Cruise cruise)
    {
        this.cruise = cruise;
        this.cruiseList = cruiseList;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ship name: ");
        String name = scanner.next();
        System.out.println("Enter destination: ");
        String destination = scanner.next();
        cruiseList.add(new Cruise((new Ship(name)), destination));
        return 0;
    }
}
