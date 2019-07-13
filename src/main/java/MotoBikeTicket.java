public class MotoBikeTicket extends Vehicle
{
    private int price;

    public MotoBikeTicket()
    {
        this.price = 10;
    }

    public int getPrice()
    {
        return price;
    }

    public int interact()
    {
        System.out.println("Your ticket cost: " + getPrice());
        return 0;
    }
}
