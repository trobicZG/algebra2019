package exceptions;

public class NotEnoughFuelException extends RuntimeException {
    private String message;

    public NotEnoughFuelException(float fuelNeeded, float fuelLeft) {
        this.message = "Not enough fuel for liftoff. Needed " + fuelNeeded + " but only " + fuelLeft + " remains";
    }

    public String getMessage() {
        return message;
    }
}
