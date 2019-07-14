package pl.example.ship;

import pl.example.*;
import pl.example.cargo.Cargo;

import java.util.ArrayList;
import java.util.List;

public class Ship
{
    private String name;
    private int space;
    private List<Humane> humaneList = new ArrayList<Humane>();
    private List<Car> carList;
    private List<MotoBike> motoBikeList;
    private List<Truck> truckList;
    private List<Bus> busList;
    private List<Cargo> cargoList;

    public Ship(String name)
    {
        this.name = name;
        this.space = 1000;
        this.humaneList = humaneList;
        this.carList = carList;
        this.motoBikeList = motoBikeList;
        this.truckList = truckList;
        this.busList = busList;
        this.cargoList = cargoList;
    }

    public String getName() {
        return name;
    }

    public int getSpace() {
        return space;
    }

    public List<Humane> getHumaneList() {
        return humaneList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<MotoBike> getMotoBikeList() {
        return motoBikeList;
    }

    public List<Truck> getTruckList() {
        return truckList;
    }

    public List<Bus> getBusList() {
        return busList;
    }

    public List<Cargo> getCargoList() {
        return cargoList;
    }

    public void addHuman(Humane humane)
    {
        humaneList.add(humane);
    }

    public void addCar(Car car)
    {
        carList.add(car);
    }

    public void setSpace(int space)
    {
        this.space = space;
    }
}
