package pl.example.file;

import pl.example.ship.Ship;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SaveToFile
{
    private Ship ship;

    public SaveToFile(Ship ship)
    {
        this.ship = ship;
    }

    public void saveToFile()
    {
        try (FileOutputStream fileOutputStream = new FileOutputStream(new File("ship.dat")))
        {
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream))
            {
                objectOutputStream.writeObject(ship);
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
