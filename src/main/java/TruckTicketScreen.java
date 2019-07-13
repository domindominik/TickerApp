import java.util.Scanner;

public class TruckTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in T");
        int weight = scanner.nextInt();
        Truck truck = new Truck(weight);
        Ticket ticket = new TruckTicket(truck);
        System.out.println("Your truck ticket cost: " + ticket.getPrice());
        return 0;
    }
}
