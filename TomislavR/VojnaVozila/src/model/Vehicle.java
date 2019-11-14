package model;

import interfaces.VehicleInterface;

public class Vehicle implements VehicleInterface {
    private float gasTankVolume;
    private float gasLeftInTank;
    private String name;

    public Vehicle(float gasTankVolume, String name) {
        this.gasTankVolume = gasTankVolume;
        this.name = name;
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
        if ((gasTankVolume-gasLeftInTank)>=howManyLiters) {
            gasLeftInTank+=howManyLiters;
        }
        else {

        }
    }

    @Override
    public void move(float howManyKm) {
        System.out.println("Moving vehicle for " + howManyKm + " Km.");

    }
}
