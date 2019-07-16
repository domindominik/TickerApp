package pl.example.file;

import pl.example.ship.Ship;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class LoadFromFile
{
    private Ship ship;

    public LoadFromFile(Ship ship)
    {
        this.ship = ship;
    }

    public void loadFromFile()
    {
        try (FileInputStream fileInputStream = new FileInputStream(new File("ships.dat")))
        {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
            {
                 Object ship = objectInputStream.readObject();
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
