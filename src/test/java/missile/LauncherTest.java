package missile;

import org.junit.jupiter.api.Test;

class LauncherTest {
    @Test
    void givenGoodLaunchCodes_MissileIsLaunched() {
        MockMissile missile = new MockMissile();

        Launcher.launchMissile(missile, new GoodLaunchCode());

        missile.verifyLaunch();
    }

    @Test
    void givenExpiredLaunchCodes_CodeRedAbort_Spy() {
        MockMissile missile = new MockMissile();

        Launcher.launchMissile(missile, new ExpiredLaunchCode());

        missile.verifyCodeRed();
    }

    @Test
    void givenUnsignedLaunchCodes_CodeRedAbort_Spy() {
        MockMissile missile = new MockMissile();

        Launcher.launchMissile(missile, new UnsignedLaunchCode());

        missile.verifyCodeRed();
    }
}
