package pl.example;

public class MotoBikeTicket extends Ticket
{
    private MotoBike motoBike;

    public MotoBikeTicket(MotoBike motoBike)
    {
        this.motoBike = motoBike;
    }

    public int getPrice()
    {
        return 10;
    }
}
