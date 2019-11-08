import model.Vehicle;

public class Application {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.setName("tenk 123");
        vehicle.setGasTankVolume(100);

        vehicle.fillGas(200);

    }

}
