package pl.example;

import java.util.Scanner;

public class TicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your vehicle type: 1. pl.example.Car, 2. Motor Bike, 3. pl.example.Truck, 4. pl.example.Bus");
        int select = scanner.nextInt();

        switch (select)
        {
            case 1:
                return 4;
            case 2:
                return 5;
            case 3:
                return 6;
            case 4:
                return 7;

        }
        return 0;
    }
}
