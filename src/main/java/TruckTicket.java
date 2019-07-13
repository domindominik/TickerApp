public class TruckTicket extends Ticket
{
    private Truck truck;

    public TruckTicket(Truck truck)
    {
        this.truck = truck;
    }

    public int getPrice()
    {
        return truck.getWeight() * 10;
    }
}
