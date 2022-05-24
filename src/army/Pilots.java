package army;

public class Pilots extends CommandoSoldiers {
    boolean jumpWithParachute;

    public Pilots() {
        jumpWithParachute = false;
    }

    public void startJumping() {
        jumpWithParachute = true;
    }

    public void stopJumping() {
        jumpWithParachute = false;
    }
}
