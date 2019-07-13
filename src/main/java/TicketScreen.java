import java.util.Scanner;

public class TicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your vehicle type: 1. Human ticket 2. Personal, 3. Motor Bike, 4. Truck, 5. Bus");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
        }
        return 0;
    }
}
