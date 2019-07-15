package pl.example.cargo;

import pl.example.Ticket;

public class CargoTicket extends Ticket
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
