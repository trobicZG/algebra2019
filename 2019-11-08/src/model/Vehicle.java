package model;

import exceptions.NotEnoughFuelException;
import exceptions.RefilFuelException;
import interfaces.VehicleInterface;

public abstract class Vehicle implements VehicleInterface {
    protected float gasTankVolume;
    protected float gasLeftInTank;
    private String name;
    protected float fuelConsumptioPer100Km;

    public float getFuelConsumptioPer100Km() {
        return fuelConsumptioPer100Km;
    }

    public void setFuelConsumptioPer100Km(float fuelConsumptioPer100Km) {
        this.fuelConsumptioPer100Km = fuelConsumptioPer100Km;
    }

    public Vehicle(String name, float gasTankVolume, float fuelConsumptioPer100Km) {
        this.name = name;
        this.gasTankVolume = gasTankVolume;
        this.gasLeftInTank = gasTankVolume;
        this.fuelConsumptioPer100Km = fuelConsumptioPer100Km;
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
        float fuelToConsume = (howManyKm / 100) * fuelConsumptioPer100Km;

        if (fuelToConsume > getGasLeftInTank()) {
            throw new NotEnoughFuelException(fuelToConsume, getGasLeftInTank());
        }

        System.out.println("Moving " + howManyKm + " km and using " + fuelToConsume + "L of fuel.");
        gasLeftInTank -= fuelToConsume;
    }
}
