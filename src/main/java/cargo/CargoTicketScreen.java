package cargo;

import java.util.Scanner;

public class CargoTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter cargo weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter cargo volume");
        int volume = scanner.nextInt();
        Cargo cargo = new Cargo(weight, volume);
        //Ticket ticket = new CargoTicket(cargo);
        return 0;
    }
}
