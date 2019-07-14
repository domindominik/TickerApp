package pl.example;

import pl.example.ship.Ship;

public class SoldTicketScreen implements Screen
{
    private Ship ship;

    public SoldTicketScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {

        System.out.println("Sold humane tickets: ");
        System.out.println(ship.getHumaneList().toString());
        /*for (int i = 0; i < ship.getHumaneList().size(); i++)
        {
            System.out.println(ship.getHumaneList().get(i).toString());
        }*/
        /*for (Humane humane: ship.getHumaneList())
        {
            System.out.println(ship.getHumaneList();
        }*/

        return 0;
    }
}
