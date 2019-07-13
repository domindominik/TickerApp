import cargo.CargoTicketScreen;

public class ScreenManager
{
    MainScreen mainScreen = new MainScreen();
    SelectTicketScreen selectTicketScreen = new SelectTicketScreen();
    TicketScreen ticketScreen = new TicketScreen();
    HumaneTicketScreen humaneTicket = new HumaneTicketScreen();
    CarTicketScreen carTicketScreen = new CarTicketScreen();
    MotoBikeScreen motoBikeScreen = new MotoBikeScreen();
    TruckTicketScreen truckTicketScreen = new TruckTicketScreen();
    BusTicketScreen busTicketScreen = new BusTicketScreen();
    CargoTicketScreen cargoTicketScreen = new CargoTicketScreen();

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
            return carTicketScreen.interact();
        }
        if (chosenScreen == 4) // moto bike ticket
        {
            return motoBikeScreen.interact();
        }
        if (chosenScreen == 5) // truck ticket
        {
            return truckTicketScreen.interact();
        }
        if (chosenScreen == 6) // moto bike ticket
        {
            return busTicketScreen.interact();
        }
        if (chosenScreen == 7) // cargo ticket
        {
            return cargoTicketScreen.interact();
        }
        return mainScreen.interact();
    }
}
