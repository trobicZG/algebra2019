public class EngineChangeStateException extends RuntimeException {
    private String message;

    public EngineChangeStateException(Manufacturer manufacturer, String model, String operationTryingtoPerform) {
        message = "Error while doing engine operation " + operationTryingtoPerform +
                " on vehicle " + manufacturer.getName() + " " + model;
    }

    public String getMessage() {
        return message;
    }
}
