package exceptions;

public class TransportOverloadException extends RuntimeException {
    String message;

    public TransportOverloadException(float maxAllowed, float wantedToTransfer) {
        this.message = "Capacity overloaded. Max allowed: " + maxAllowed + " but " +
                "received " + wantedToTransfer;
    }

    public String getMessage() {
        return message;
    }
}
