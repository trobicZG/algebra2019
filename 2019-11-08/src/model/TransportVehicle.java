package model;

import exceptions.TransportOverloadException;
import interfaces.TransportVehicleInterface;

public class TransportVehicle extends Vehicle implements TransportVehicleInterface {

    private int maxPeopleCount;
    private float maxCargoWeight;

    public int getMaxPeopleCount() {
        return maxPeopleCount;
    }

    public TransportVehicle(String name, float gasTankVolume, int maxPeopleCount, float maxCargoWeight) {
        super(name, gasTankVolume);
        this.maxPeopleCount = maxPeopleCount;
        this.maxCargoWeight = maxCargoWeight;
    }

    public float getMaxCargoWeight() {
        return maxCargoWeight;
    }

    @Override
    public void transportPeople(int howMany) {
        if (maxPeopleCount < howMany) {
            throw new TransportOverloadException(maxPeopleCount, howMany);
        }
        System.out.println("Transporting " + howMany + " people in vehicle " + getName());
    }

    @Override
    public void transportCargo(float weight) {
        if (maxCargoWeight < weight) {
            throw new TransportOverloadException(maxCargoWeight, weight);
        }
        System.out.println("Transporting " + weight + "kg in vehicle " + getName());
    }
}
