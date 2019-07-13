import java.util.Scanner;

public class MainScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tickets, 2. Setting, 10. Exit");
        int selection = scanner.nextInt();

        switch (selection)
        {
            case 1:
                return 1;

            case 2:
                return 2;

            case 10:
                return 10;
        }
        return 0;
    }
}
