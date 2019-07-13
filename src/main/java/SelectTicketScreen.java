import java.util.Scanner;

public class SelectTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        int selection = scanner.nextInt();

        switch (selection)
        {
            case 1:
                return 1;
            case 2:
                return 2;
        }
        return 0;
    }
}
