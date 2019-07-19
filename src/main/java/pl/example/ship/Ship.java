package pl.example.ship;

import pl.example.*;
import pl.example.cargo.Cargo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Ship implements Serializable
{
    private String name;
    private int space;
    private List<Humane> humaneList = new ArrayList<Humane>();
    private List<Car> carList = new ArrayList<Car>();
    private List<MotorBike> motorBikeList = new ArrayList<MotorBike>();
    private List<Truck> truckList = new ArrayList<Truck>();
    private List<Bus> busList = new ArrayList<Bus>();
    private List<Cargo> cargoList = new ArrayList<Cargo>();
    private Car car = new Car();

    public Ship(String name)
    {
        this.name = name;
        this.space = 1000;
        this.humaneList = humaneList;
        this.carList = carList;
        this.motorBikeList = motorBikeList;
        this.truckList = truckList;
        this.busList = busList;
        this.cargoList = cargoList;
        this.car = car;
    }



    public String getName()
    {
        return name;
    }

    public int getSpace()
    {
        return space;
    }

    public List<Humane> getHumaneList() {
        return humaneList;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public List<MotorBike> getMotorBikeList() {
        return motorBikeList;
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

    public void addCargo(Cargo cargo)
    {
        cargoList.add(cargo);
    }

    public void addTruck(Truck truck)
    {
        truckList.add(truck);
    }

    public void addBus(Bus bus)
    {
        busList.add(bus);
    }

    public void addMotorBike(MotorBike motorBike)
    {
        motorBikeList.add(motorBike);
    }

    public int quantityCar()
    {
        return space / car.getSpaceUnit();
        //return space / carList.get(0).getSpaceUnit();
    }
}
