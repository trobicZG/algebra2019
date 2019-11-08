package model;

import exceptions.NoAmunitionLeftException;

public class Tank extends WeaponizedVehicle {

    public Tank(String name, float gasTankVolume, int maxAmounitionCount) {
        super(name, gasTankVolume, maxAmounitionCount);
    }

    @Override
    public void fire() {
        if (!(amunitionLeft > 0)) {
            throw new NoAmunitionLeftException(getName());
        }
        System.out.println("Firing from " + this.getClass().getSimpleName() + " " + getName());
        amunitionLeft--;
    }
}
