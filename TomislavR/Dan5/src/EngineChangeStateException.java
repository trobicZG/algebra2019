public class EngineChangeStateException extends RuntimeException {
    private String message;

    public EngineChangeStateException (Manufacturer manufacturer, String model, String operationTryingToPerform) {
        message = "Error while doing engine operation " + operationTryingToPerform + " on vehicle " + manufacturer.getName() + " " + model;
    }

    public String getMessage() {
        return message;
    }

}
