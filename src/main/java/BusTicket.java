public class BusTicket extends Ticket
{
    private Bus bus;

    public BusTicket(Bus bus)
    {
        this.bus = bus;
    }

    public int getPrice()
    {
        return bus.getLength() * 5;
    }
}
