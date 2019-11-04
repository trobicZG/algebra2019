package namebook;

public class InvalidOptionException extends RuntimeException {
    private String message;

    public InvalidOptionException(int option) {
        this.message = "ERROR: " + option + " is not a valid option!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
