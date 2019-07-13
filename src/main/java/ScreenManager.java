public class ScreenManager
{
    MainScreen mainScreen = new MainScreen();
    TicketScreen ticketScreen = new TicketScreen();
    HumaneTicketScreen humaneTicket = new HumaneTicketScreen();
    CarTicket carTicket = new CarTicket();
    MotoBikeTicket motoBikeTicket = new MotoBikeTicket();
    TruckTicketScreen truckTicketScreen = new TruckTicketScreen();
    BusTicketScreen busTicketScreen = new BusTicketScreen();

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
            return ticketScreen.interact();
        }
        if (chosenScreen == 2) // humane ticket
        {
            return humaneTicket.interact();
        }
        if (chosenScreen == 3) // car ticket
        {
            return carTicket.interact();
        }
        if (chosenScreen == 4) // moto bike ticket
        {
            return motoBikeTicket.interact();
        }
        if (chosenScreen == 5) // truck ticket
        {
            return truckTicketScreen.interact();
        }
        if (chosenScreen == 6) // moto bike ticket
        {
            return busTicketScreen.interact();
        }
        return mainScreen.interact();
    }
}
