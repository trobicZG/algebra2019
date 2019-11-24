package ArmyVehicles.model;

import exceptions.NoAmunitionLeftException;
import ArmyVehicles.exceptions.NotEnoughFuelException;

public class Tank extends WeaponizedVehicle {
    public Tank(String name, float gasTankVolume, int maxAmounitionCount, float fuelConsumption) {
        super(name, gasTankVolume, maxAmounitionCount, fuelConsumption);
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
