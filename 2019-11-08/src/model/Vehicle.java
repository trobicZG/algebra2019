package model;

import exceptions.RefilFuelException;
import interfaces.VehicleInterface;

public abstract class Vehicle implements VehicleInterface {
    private float gasTankVolume;
    private float gasLeftInTank;
    private String name;

    public Vehicle(String name, float gasTankVolume) {
        this.name = name;
        this.gasTankVolume = gasTankVolume;
    }

    public String getName() {
        return name;
    }

    public float getGasTankVolume() {
        return gasTankVolume;
    }

    public float getGasLeftInTank() {
        return gasLeftInTank;
    }

    @Override
    public void fillGas(float howManyLiters) {
        if ((gasTankVolume - gasLeftInTank) >= howManyLiters) {
            gasLeftInTank += howManyLiters;
        } else {
            throw new RefilFuelException(gasTankVolume - gasLeftInTank, howManyLiters);
        }
    }

    @Override
    public void move(float howManyKm) {
        System.out.println("Moving vehicle " + name + " for " + howManyKm + "km.");
    }
}
