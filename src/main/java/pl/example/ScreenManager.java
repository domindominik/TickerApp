package pl.example;

import pl.example.cargo.CargoTicketScreen;
import pl.example.cruise.Cruise;
import pl.example.cruise.CruiseScreen;
import pl.example.file.LoadFromFileScreen;
import pl.example.file.SaveToFile;
import pl.example.file.SaveToFileScreen;
import pl.example.finder.FindHumanScreen;
import pl.example.ship.Ship;
import pl.example.ship.ShipStatusScreen;

import java.util.ArrayList;
import java.util.List;

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
    SaveToFileScreen saveToFileScreen = new SaveToFileScreen(ship);
    LoadFromFileScreen loadFromFileScreen = new LoadFromFileScreen(ship);
    FindHumanScreen findHumanScreen = new FindHumanScreen(ship);
    CruiseScreen cruiseScreen = new CruiseScreen();
    private static List<Cruise> cruiseList = new ArrayList<>();

    int chosenScreen;

    public void manager()
    {
        chosenScreen = 0;
        while (true)
        {
            chosenScreen = chosenScreen(chosenScreen);
        }
    }

    public static List<Cruise> getCruiseList()
    {
        return cruiseList;
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
        if (chosenScreen == 2) // menu ticket
        {
            return humaneTicket.interact();
        }
        if (chosenScreen == 3) // human ticket
        {
            return ticketScreen.interact();
        }
        if (chosenScreen == 4) // car ticket
        {
            return carTicketScreen.interact();
        }
        if (chosenScreen == 5) // truck ticket
        {
            return motorBikeScreen.interact();
        }
        if (chosenScreen == 6) // motor bike ticket
        {
            return truckTicketScreen.interact();
        }
        if (chosenScreen == 7)
        {
            return busTicketScreen.interact();
        }
        if (chosenScreen == 8)  // cargo ticket
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
        if (chosenScreen == 11) // save to file
        {
            return saveToFileScreen.interact();
        }
        if (chosenScreen == 12) // load file
        {
            return loadFromFileScreen.interact();
        }
        if (chosenScreen == 13) // find human
        {
            return findHumanScreen.interact();
        }
        if (chosenScreen == 14) // add new cruise

        return mainScreen.interact();
        {
            return cruiseScreen.interact();
        }
    }

    public static void addCruise(Cruise cruise)
    {
        cruiseList.add(cruise);
    }


}
