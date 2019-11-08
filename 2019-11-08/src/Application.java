import model.FighterJet;
import model.Tank;
import model.TransportJet;

public class Application {

    public static void main(String[] args) {
        TransportJet transportJet = new TransportJet("antunov", 5000, 1000, 60000, 20);
        FighterJet fighterJet = new FighterJet("MIG", 1000, 2, 30);
        Tank tank = new Tank("Tenk1", 500, 10, 10);

        System.out.println(transportJet.getGasLeftInTank());
        transportJet.move(1000);
        System.out.println(transportJet.getGasLeftInTank());

        System.out.println(fighterJet.getGasLeftInTank());
        fighterJet.move(1000);
        System.out.println(fighterJet.getGasLeftInTank());

        System.out.println(tank.getGasLeftInTank());
        tank.move(1000);
        System.out.println(tank.getGasLeftInTank());

    }
}
