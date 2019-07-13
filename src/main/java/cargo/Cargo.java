package cargo;

public class Cargo
{
    private int weight;
    private int volume;

    public Cargo(int weight, int volume)
    {
        this.weight = weight;
        this.volume = volume;
    }

    public int getWeight()
    {
        return weight;
    }

    public int getVolume()
    {
        return volume;
    }
}
