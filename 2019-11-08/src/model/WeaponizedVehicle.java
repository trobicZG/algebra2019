package model;

import exceptions.NoAmunitionLeftException;
import interfaces.WeaponizedVehicleInterface;

public abstract class WeaponizedVehicle extends Vehicle implements WeaponizedVehicleInterface {
    private int maxAmounitionCount;
    private int amunitionLeft;

    public WeaponizedVehicle(String name, float gasTankVolume, int maxAmounitionCount) {
        super(name, gasTankVolume);
        this.maxAmounitionCount = maxAmounitionCount;
        this.amunitionLeft = maxAmounitionCount;
    }

    @Override
    public void fire() {
        if (!(amunitionLeft > 0)) {
            throw new NoAmunitionLeftException(getName());
        }
        System.out.println("Firing from " + getName());
        amunitionLeft--;
    }
}
