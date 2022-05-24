package army;

public class F35 extends Helicopters {
    boolean shoot;

    public F35() {
        shoot = false;
    }

    public void startShooting() {
        shoot = true;
    }

    public void stopShooting() {
        shoot = false;
    }
}
