import model.FighterJet;
import model.Tank;

public class Application {

    public static void main(String[] args) {
        FighterJet fighterJet = new FighterJet("lovac1", 200, 3);
        fighterJet.liftOff();
        fighterJet.fire();
        fighterJet.fire();
        fighterJet.fire();
        fighterJet.fire();

    }
}
