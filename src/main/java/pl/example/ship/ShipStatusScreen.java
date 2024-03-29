package pl.example.ship;

import pl.example.Car;
import pl.example.Humane;
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
        System.out.println("Ship's name: " + ship.getName() +
                "\nQuantity of humane tickets sold: " + ship.getHumaneList().size() +
                "\nQuantity of car tickets sold: " + ship.getCarList().size() +
                "\nQuantity of motor bike tickets sold: " + ship.getMotorBikeList().size() +
                "\nQuantity of truck tickets sold: " + ship.getTruckList().size() +
                "\nQuantity of bus tickets sold: " + ship.getBusList().size() +
                "\nQuantity of cargo tickets sold: " + ship.getCargoList().size() +
                "\nFree space: " + ship.getSpace() +
                "\nFree space for car: " + ship.quantityCar() +
                "\nFree space for motor: " + ship.quantityMotorBike() +
                "\nFree space for truck: " + ship.quantityTruck() +
                "\nFree space for bus: " + ship.quantityBus());

        for (Car car: ship.getCarList())
        {
            for (Humane humane: car.getPassengerList())
            {
                System.out.println(humane.toString());
            }
        }
        return 0;
    }
}
