public class ScreenManager
{
    MainScreen mainScreen = new MainScreen();
    TicketScreen ticketScreen = new TicketScreen();
    PeopleTicket peopleTicket = new PeopleTicket();

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
        if (chosenScreen == 1)
        {
            return ticketScreen.interact();
        }
        if (chosenScreen == 2)
        {
            return peopleTicket.interact();
        }
        return mainScreen.interact();
    }
}
