import model.Tank;

public class Application {

    public static void main(String[] args) {
        Tank t = new Tank("Pero", 1000, 3);
        t.fire();
        t.fire();
        t.fire();
        t.fire();
    }
}
