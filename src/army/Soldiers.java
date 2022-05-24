package army;

public class Soldiers {
    boolean shoot;

    public Soldiers() {
        shoot = false;
    }

    public void startShooting() {
        shoot = true;
    }

    public void stopShooting() {
        shoot = false;
    }
}
