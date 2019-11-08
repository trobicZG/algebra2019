package model;

import exceptions.NoAmunitionLeftException;
import exceptions.NotEnoughFuelException;
import interfaces.AirVehicleInterface;

public class FighterJet extends WeaponizedVehicle implements AirVehicleInterface {
    private static final float GAS_NEEDED_FOR_LIFTOFF = 5F;

    public FighterJet(String name, float gasTankVolume, int maxAmounitionCount, float fuelConsumption) {
        super(name, gasTankVolume, maxAmounitionCount, fuelConsumption);
    }

    @Override
    public void liftOff() {
        if (!(getGasLeftInTank() > GAS_NEEDED_FOR_LIFTOFF)) {
            throw new NotEnoughFuelException(GAS_NEEDED_FOR_LIFTOFF, getGasLeftInTank());
        }
        System.out.println("Liftoff successful for vehicle " + getName());
    }

    @Override
    public void fire() {
        if (!(amunitionLeft > 0)) {
            throw new NoAmunitionLeftException(getName());
        }
        System.out.println("Firing from " + getClass().getSimpleName() + " " + getName());
        this.amunitionLeft--;
    }
}
