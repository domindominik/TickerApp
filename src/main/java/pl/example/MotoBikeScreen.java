package pl.example;

public class MotoBikeScreen implements Screen
{
    public int interact()
    {
        MotoBike motoBike = new MotoBike();
        Ticket ticket = new MotoBikeTicket(motoBike);
        System.out.println("Your moto bike ticket cost: " + ticket.getPrice());
        return 0;
    }
}
