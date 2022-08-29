package missile;

public class Launcher {
    static void launchMissile(Missile missile, LaunchCode launchCode) {
        if (launchCode.isExpired() || !launchCode.isSigned()) {
            missile.disable();
        } else {
            missile.launch();
        }
    }
}
