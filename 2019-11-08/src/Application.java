import model.FighterJet;
import model.Tank;
import model.TransportJet;

public class Application {

    public static void main(String[] args) {
        TransportJet transportJet = new TransportJet("antunov", 5, 1000, 60000);

        transportJet.liftOff();
    }
}
