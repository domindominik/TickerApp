package pl.example.cargo;

public class Cargo
{
    private int volume;
    private int price;

    public Cargo(int volume)
    {
        this.volume = volume;
        this.price = 0;
    }

    public int getVolume()
    {
        return volume;
    }
}
