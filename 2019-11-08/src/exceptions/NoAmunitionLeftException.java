package exceptions;

public class NoAmunitionLeftException extends RuntimeException {
    private String message;

    public NoAmunitionLeftException(String vehicleName) {
        this.message = "No Amunition left in vehicle " + vehicleName;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
