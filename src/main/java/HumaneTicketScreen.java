import java.util.Scanner;

public class HumaneTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.next();
        System.out.println("Enter your surname: ");
        String surname = scanner.next();
        System.out.println("Enter your age: ");
        int age = scanner.nextInt();

        Humane humane = new Humane(age, name, surname);
        Ticket ticket = new HumaneTicket(humane);
        System.out.println("Your ticket cost: " + ticket.getPrice());
        return 0;
    }
}
