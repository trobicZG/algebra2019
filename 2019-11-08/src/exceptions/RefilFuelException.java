package exceptions;

public class RefilFuelException extends RuntimeException {
    private String message;

    public RefilFuelException(float remainingTankVolume, float refillingAmount) {
        this.message = "Error while refilling gas. Tried to refill " + refillingAmount + " but have space for only " + remainingTankVolume;
    }

    public String getMessage() {
        return message;
    }
}
