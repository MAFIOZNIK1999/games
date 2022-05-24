package army;

public class Tanks extends Jeeps {
    boolean shoot;

    public Tanks() {
        shoot = false;
    }

    public void startShooting() {
        shoot = true;
    }

    public void stopShooting() {
        shoot = false;
    }
}
