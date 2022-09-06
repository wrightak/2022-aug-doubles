package missile;

public class Launcher {
        static void launchMissile(Missile missile, LaunchCode launchCode, UsedLaunchCodesRepo usedLaunchCodesRepo) {
        if (usedLaunchCodesRepo.contains(launchCode)
                || launchCode.isExpired()
                || !launchCode.isSigned()) {
            missile.disable();
        } else {
            usedLaunchCodesRepo.add(launchCode);
            missile.launch();
        }
    }
}
