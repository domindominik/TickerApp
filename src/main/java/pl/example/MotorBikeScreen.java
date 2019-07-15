package pl.example;

public class MotorBikeScreen implements Screen
{
    public int interact()
    {
        MotorBike motorBike = new MotorBike();
        Ticket ticket = new MotorBikeTicket(motorBike);
        System.out.println("Your moto bike ticket cost: " + ticket.getPrice());
        return 0;
    }
}
