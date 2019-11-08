package model;

import interfaces.WeaponizedVehicleInterface;

public abstract class WeaponizedVehicle extends Vehicle implements WeaponizedVehicleInterface {
    protected int maxAmounitionCount;
    protected int amunitionLeft;

    public int getMaxAmounitionCount() {
        return maxAmounitionCount;
    }

    public int getAmunitionLeft() {
        return amunitionLeft;
    }

    public WeaponizedVehicle(String name, float gasTankVolume, int maxAmounitionCount) {
        super(name, gasTankVolume);
        this.maxAmounitionCount = maxAmounitionCount;
        this.amunitionLeft = maxAmounitionCount;
    }
}
