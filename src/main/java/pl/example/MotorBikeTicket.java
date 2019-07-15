package pl.example;

public class MotorBikeTicket extends Ticket
{
    private MotorBike motorBike;

    public MotorBikeTicket(MotorBike motorBike)
    {
        this.motorBike = motorBike;
    }

    public int getPrice()
    {
        return 10;
    }
}
