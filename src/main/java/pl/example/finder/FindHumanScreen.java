package pl.example.finder;

import pl.example.Screen;
import pl.example.ship.Ship;

import java.util.Scanner;

public class FindHumanScreen implements Screen
{
    private Ship ship;

    public FindHumanScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name or surname the human: ");
        String name = scanner.next();
        FindHuman findHuman = new FindHuman(ship);
        findHuman.findHuman(name);
        return 0;
    }
}
