package pl.example.cargo;

import java.io.Serializable;

public class Cargo implements Serializable
{
    private int volume;
    private int price;
    public static final int spaceUnit = 5;


    public Cargo(int volume)
    {
        this.volume = volume;
        this.price = 0;
    }

    public int getVolume()
    {
        return volume;
    }

    public int getPrice()
    {
        return price;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
