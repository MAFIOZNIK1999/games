package army;

public class CommandoSoldiers extends Soldiers {
    boolean grenade;

    public CommandoSoldiers() {
        grenade = false;
    }

    public void startThrowGrenade() {
        grenade = true;
    }

    public void stopThrowGrenade() {
        grenade = false;
    }
}