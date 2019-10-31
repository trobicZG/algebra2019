public class Application {
    public static void main(String[] args) {

        System.out.println("Zbrajanje 10 + 5");
        System.out.println(Calculator.sum(10D, 5D));

        System.out.println("Oduzimanje 10 - 5");
        System.out.println(Calculator.substract(10D, 5D));

        System.out.println("Mnozenje 10 * 5");
        System.out.println(Calculator.multiply(10D, 5D));

        System.out.println("Dijeljenje 10 / 5");
        System.out.println(Calculator.divide(10D, 5D));

        System.out.println("Dijeljenje 10 / 0");
        System.out.println(Calculator.divide(10D, 0D));
    }
}
