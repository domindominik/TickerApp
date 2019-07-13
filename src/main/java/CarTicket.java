public class CarTicket
{
    private int price;

    public CarTicket()
    {
        this.price = 20;
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
