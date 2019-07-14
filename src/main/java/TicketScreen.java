import java.util.Scanner;

public class TicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your vehicle type: 1. Car, 2. Motor Bike, 3. Truck, 4. Bus");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
                return 7;
        }
        return 0;
    }
}
