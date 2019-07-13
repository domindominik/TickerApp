import java.util.Scanner;

public class TruckTicketScreen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in T");
        int weight = scanner.nextInt();
        Vehicle vehicle = new Vehicle();
        vehicle.setLength(weight);
        System.out.println("Your ticket cost: " + vehicle.getPrice());
        return 0;
    }
}
