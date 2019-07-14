package pl.example;

public class CarTicketScreen implements Screen
{
    public int interact()
    {
        Car car = new Car();
        Ticket ticket = new CarTicket(car);
        System.out.println("Your car ticket cost: " + ticket.getPrice());
        return 0;
    }
}
