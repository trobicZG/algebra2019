package interfaces;

public class NoAmmunitionLeftException extends RuntimeException {
    private String message;
    void NoAmmunitionLeftException (String message) {
        this.message = message;
    }
}
