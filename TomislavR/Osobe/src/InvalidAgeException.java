public class InvalidAgeException extends RuntimeException {

    private String message;

    public InvalidAgeException() {
        this.message = "Wrong age!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
