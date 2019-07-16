package pl.example.file;

import pl.example.Screen;
import pl.example.ship.Ship;

public class LoadFromFileScreen implements Screen
{
    private Ship ship;

    public LoadFromFileScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        LoadFromFile loadFromFile = new LoadFromFile(ship);
        loadFromFile.loadFromFile();
        System.out.println("ok");
        return 0;
    }
}
