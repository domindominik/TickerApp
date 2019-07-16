package pl.example.file;

import pl.example.Screen;
import pl.example.ship.Ship;

public class SaveToFileScreen implements Screen
{
    private Ship ship;

    public SaveToFileScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        SaveToFile saveToFile = new SaveToFile(ship);
        saveToFile.saveToFile();

        return 0;
    }
}
