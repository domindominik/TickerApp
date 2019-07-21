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

    public Ship loadFromFile()
    {
        try (FileInputStream fileInputStream = new FileInputStream(new File("ship.dat")))
        {
            try (ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream))
            {
                 ship = (Ship) objectInputStream.readObject();
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return ship;
    }
}
