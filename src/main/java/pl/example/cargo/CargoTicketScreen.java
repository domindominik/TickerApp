package pl.example.cargo;

import pl.example.Screen;

import java.util.Scanner;

public class CargoTicketScreen implements Screen
{
    public int interact()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter pl.example.cargo weight: ");
        int weight = scanner.nextInt();
        System.out.println("Enter pl.example.cargo volume");
        int volume = scanner.nextInt();
        Cargo cargo = new Cargo(weight, volume);
        //pl.example.Ticket ticket = new CargoTicket(pl.example.cargo);
        return 0;
    }
}
