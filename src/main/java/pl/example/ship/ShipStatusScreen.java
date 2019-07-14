package pl.example.ship;

import pl.example.Screen;

public class ShipStatusScreen implements Screen
{
    private Ship ship;

    public ShipStatusScreen(Ship ship)
    {
        this.ship = ship;
    }

    public int interact()
    {
        System.out.println("quantity of humane tickets sold: " + ship.getHumaneList().size() +
                "\nFree space: " + ship.getSpace());
        return 0;
    }

    // TODO ile można jeszcze wprowadzić danych obiektów
}
