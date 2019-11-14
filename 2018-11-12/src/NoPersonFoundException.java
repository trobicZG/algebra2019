public class NoPersonFoundException extends RuntimeException {

    private String message;

    NoPersonFoundException(int id) {
        this.message = "Person with id " + id + " not found!";
    }

    @Override
    public String getMessage() {
        return message;
    }
}
