import java.util.Scanner;

public class PeopleTicket
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

        People people = new People(age, name, surname, price(age));
        System.out.println("Your ticket cost: " + people.getPrice());

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
