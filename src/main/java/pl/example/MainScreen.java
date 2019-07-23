package pl.example;

import java.util.Scanner;

public class MainScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Tickets, 2. Setting, 3. Cargo, 4. Sold tickets, 5. Ship status, 6. Save object to file, 7. Load from file, 8. Find human, 9. Creating new cruise, 10. Exit"); // main menu
        int selection = scanner.nextInt();

        switch (selection)
        {
            case 1:
                return 1;

            case 2:
                return 2;

            case 3:
                return 8;

            case 4:
                return 9;

            case 5:
                return 10;

            case 6:
                return 11;

            case 7:
                return 12;

            case 8:
                return 13;

            case 9:
                return 14;

            case 10:
                return 15;
        }
        return 0;
    }
}
