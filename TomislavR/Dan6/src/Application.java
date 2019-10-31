public final class Application {
    public static void main(String[] args) {
        double a=10;
        double b=8;
        System.out.println(Calculator.Add(a,b));
        System.out.println(Calculator.Subtract(a,b));
        System.out.println(Calculator.Multiply(a,b));
        try {
            System.out.println(Calculator.Divide(a,0));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
}
