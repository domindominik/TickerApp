public class HumaneTicket extends Ticket
{
    private Humane humane;

    public HumaneTicket(Humane humane)
    {
        this.humane = humane;
    }

    public int getPrice()
    {
        return 0;
    }

    public int price (int age)
    {
        if (age < 3)
        {
            return 0;
        }
        if (age < 18)
        {
            return 5;
        }
        if (age < 70)
        {
            return 10;
        }
        return 5;
    }
}
