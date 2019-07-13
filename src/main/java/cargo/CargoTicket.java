package cargo;

public class CargoTicket
{
    private Cargo cargo;

    public CargoTicket(Cargo cargo)
    {
        this.cargo = cargo;
    }

    public int getPrice()
    {
        return cargo.getVolume() * 50;
    }
}
