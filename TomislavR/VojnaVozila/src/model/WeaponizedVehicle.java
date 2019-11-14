package model;

import interfaces.WeaponizedVehicleInterface;

public abstract class WeaponizedVehicle extends Vehicle implements WeaponizedVehicleInterface {
    private int ammunitionCount;
    private int ammunitionLeft;

    WeaponizedVehicle(float gasTankVolume, String name, int ammunitionCount) {
        super(gasTankVolume, name);
        this.ammunitionCount=ammunitionCount;
        this.ammunitionLeft = ammunitionCount;
    }

    @Override
    public void fire(int howMany) {
        System.out.println("Firing from " + getName());

    }

    @Override
    public void reload(int howMany) {

    }
}
