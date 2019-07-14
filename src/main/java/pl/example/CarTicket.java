package pl.example;

public class CarTicket extends Ticket
{
    private Car car;

    public CarTicket(Car car)
    {
        this.car = car;
    }

    public int getPrice()
    {
        return 20;
    }
}
