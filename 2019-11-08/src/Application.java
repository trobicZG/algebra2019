import model.TransportVehicle;
import model.Vehicle;
import model.WeaponizedVehicle;

public class Application {

    public static void main(String[] args) {
        TransportVehicle transportVehicle = new TransportVehicle("v1", 100,5, 100);

        transportVehicle.transportCargo(50);

    }

}
