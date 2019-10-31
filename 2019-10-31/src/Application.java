public class Application {
    public static void main(String[] args) {

        System.out.println("Zbrajanje 10 + 5");
        System.out.println(SimpleCalculator.sum(10D, 5D));

        System.out.println("Oduzimanje 10 - 5");
        System.out.println(SimpleCalculator.substract(10D, 5D));

        System.out.println("Mnozenje 10 * 5");
        System.out.println(SimpleCalculator.multiply(10D, 5D));

        System.out.println("Dijeljenje 10 / 5");
        System.out.println(SimpleCalculator.divide(10D, 5D));

        System.out.println("Dijeljenje 10 / 0");
        //System.out.println(SimpleCalculator.divide(10D, 0D));

        System.out.println("Modified substract");
        System.out.println(ModifiedCalculator.substract(10D, 5D));

        

    }
}
