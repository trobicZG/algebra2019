public class ModifiedCalculator extends SimpleCalculator {

    public static Double substract(Double a, Double b) {
        return a + b;
    }

    // Example of method we can't override because in the parent class it is marked as final
//    public static Double sum(Double a, Double b) {
//        return a + b;
//    }
}
