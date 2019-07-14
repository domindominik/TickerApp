package pl.example;

import java.util.Scanner;

public class SelectTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Human tickets, 2. Vehicle tickets");
        int selection = scanner.nextInt();

        switch (selection)
        {
            case 1:
                return 2;
            case 2:
                return 3;
        }
        return 0;
    }
}
