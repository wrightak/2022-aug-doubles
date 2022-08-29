package missile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LauncherTest {
    @Test
    void givenExpiredLaunchCodes_MissileIsNotLaunched_Dummy() {
        Launcher.launchMissile(new DummyMissile(), new ExpiredLaunchCode());
    }

    @Test
    void givenExpiredLaunchCodes_MissileIsNotLaunched_Spy() {
        // arrange - 準備
        SpyMissile missile = new SpyMissile();

        // act - 実行
        Launcher.launchMissile(missile, new ExpiredLaunchCode());

        // assert - 確認
        assertFalse(missile.launchWasCalled());
    }

    @Test
    void givenValidLaunchCodes_MissileIsLaunched() {

    }
}
