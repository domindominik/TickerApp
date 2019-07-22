package pl.example.cruise;

import pl.example.Screen;
import pl.example.ScreenManager;
import pl.example.ship.Ship;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CruiseScreen implements Screen
{
    private Cruise cruise;
    //private List<Cruise> cruiseList = new ArrayList<>();

    //public CruiseScreen(Cruise cruise)
    public CruiseScreen()
    {
        this.cruise = cruise;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ship name: ");
        String name = scanner.next();
        cruise.setShip(new Ship(name));
        System.out.println("Enter destination: ");
        String destination = scanner.next();
        cruise.setDestination(destination);
        ScreenManager.addCruise(cruise);    //dodanie statku do listy rejsów

        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ship name: ");
        String name = scanner.next();
        System.out.println("Enter destination: ");
        String destination = scanner.next();
        ScreenManager.addCruise(new Cruise((new Ship(name)), destination));*/

        return 0;
    }
}
