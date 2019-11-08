package model;

import exceptions.NotEnoughFuelException;
import interfaces.AirVehicleInterface;

public class TransportJet extends TransportVehicle implements AirVehicleInterface {
    private static final float GAS_NEEDED_FOR_LIFTOFF = 10F;

    public TransportJet(String name, float gasTankVolume, int maxPeopleCount, float maxCargoWeight, float fuelConsumption) {
        super(name, gasTankVolume, maxPeopleCount, maxCargoWeight, fuelConsumption);
    }

    @Override
    public void liftOff() {
        if (!(getGasLeftInTank() > GAS_NEEDED_FOR_LIFTOFF)) {
            throw new NotEnoughFuelException(GAS_NEEDED_FOR_LIFTOFF, getGasLeftInTank());
        }
        System.out.println("Liftoff successful for vehicle " + getName());
    }
}
