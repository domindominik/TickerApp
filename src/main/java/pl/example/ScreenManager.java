package pl.example;

import pl.example.cargo.CargoTicketScreen;
import pl.example.ship.Ship;
import pl.example.ship.ShipStatusScreen;

public class ScreenManager
{
    MainScreen mainScreen = new MainScreen();
    SelectTicketScreen selectTicketScreen = new SelectTicketScreen();
    TicketScreen ticketScreen = new TicketScreen();

    Ship ship = new Ship("titanic");
    SoldTicketScreen soldTicketScreen = new SoldTicketScreen(ship);
    HumaneTicketScreen humaneTicket = new HumaneTicketScreen(ship);
    ShipStatusScreen shipStatusScreen = new ShipStatusScreen(ship);
    CargoTicketScreen cargoTicketScreen = new CargoTicketScreen(ship);
    CarTicketScreen carTicketScreen = new CarTicketScreen(ship);
    MotorBikeScreen motorBikeScreen = new MotorBikeScreen(ship);
    TruckTicketScreen truckTicketScreen = new TruckTicketScreen(ship);
    BusTicketScreen busTicketScreen = new BusTicketScreen(ship);

    int chosenScreen;

    public void manager()
    {
        chosenScreen = 0;
        while (true)
        {
            chosenScreen = chosenScreen(chosenScreen);
        }
    }

    private int chosenScreen(int chosenScreen)
    {
        if (chosenScreen == 0)
        {
            return mainScreen.interact();
        }
        if (chosenScreen == 1) // tickets menu
        {
            return selectTicketScreen.interact();
        }
        if (chosenScreen == 2) // humane ticket
        {
            return humaneTicket.interact();
        }
        if (chosenScreen == 3) // car ticket
        {
            return ticketScreen.interact();
        }
        if (chosenScreen == 4) // moto bike ticket
        {
            return carTicketScreen.interact();
        }
        if (chosenScreen == 5) // truck ticket
        {
            return motorBikeScreen.interact();
        }
        if (chosenScreen == 6) // moto bike ticket
        {
            return truckTicketScreen.interact();
        }
        if (chosenScreen == 7)
        {
            return busTicketScreen.interact();
        }
        if (chosenScreen == 8)  // pl.example.cargo ticket
        {
            return cargoTicketScreen.interact();
        }
        if (chosenScreen == 9)  // sold ticket
        {
            return soldTicketScreen.interact();
        }
        if (chosenScreen == 10)  // ship information
        {
            return shipStatusScreen.interact();
        }
        //TODO
        // save to file
        // load from file
        // find human
        return mainScreen.interact();
    }
}
