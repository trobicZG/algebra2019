public final class SimpleCalculator {
    public static Double sum(Double a, Double b) {
        return a + b;
    }

    public static Double substract(Double a, Double b) {
        return a - b;
    }

    public static Double multiply(Double a, Double b) {
        return a * b;
    }

    public static Double divide(Double a, Double b) {
        if (b == 0) {
            throw new IllegalArgumentException("You can't divide by zero!");
        }
        return a / b;
    }
}
