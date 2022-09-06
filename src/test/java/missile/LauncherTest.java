package missile;

import org.junit.jupiter.api.Test;

import static missile.Launcher.launchMissile;

class LauncherTest {
    @Test
    void givenGoodLaunchCodes_MissileIsLaunched() {
        MockMissile missile = new MockMissile();

        launchMissile(missile, new GoodLaunchCode(), new FakeUsedLaunchCodesRepo());

        missile.verifyLaunch();
    }

    @Test
    void givenExpiredLaunchCodes_CodeRedAbort() {
        MockMissile missile = new MockMissile();

        launchMissile(missile, new ExpiredLaunchCode(), new FakeUsedLaunchCodesRepo());

        missile.verifyCodeRed();
    }

    @Test
    void givenUnsignedLaunchCodes_CodeRedAbort() {
        MockMissile missile = new MockMissile();

        launchMissile(missile, new UnsignedLaunchCode(), new FakeUsedLaunchCodesRepo());

        missile.verifyCodeRed();
    }

    @Test
    void reusedLaunchCode_CodeRedAbort() {
        MockMissile mockMissile1 = new MockMissile();
        MockMissile mockMissile2 = new MockMissile();
        LaunchCode goodLaunchCode = new GoodLaunchCode();
        UsedLaunchCodesRepo usedLaunchCodesRepo = new FakeUsedLaunchCodesRepo();

        launchMissile(mockMissile1, goodLaunchCode, usedLaunchCodesRepo);
        launchMissile(mockMissile2, goodLaunchCode, usedLaunchCodesRepo);

        mockMissile2.verifyCodeRed();
    }
}
