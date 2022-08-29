package missile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LauncherTest {
    @Test
    void givenExpiredLaunchCodes_MissileIsNotLaunched_Spy() {
        SpyMissile missile = new SpyMissile();

        Launcher.launchMissile(missile, new ExpiredLaunchCode());

        assertFalse(missile.launchWasCalled());
        assertTrue(missile.disableWasCalled());
    }

    @Test
    void givenUnsignedLaunchCodes_MissileIsNotLaunched_Spy() {
        SpyMissile missile = new SpyMissile();

        Launcher.launchMissile(missile, new UnsignedLaunchCode());

        assertFalse(missile.launchWasCalled());
        assertTrue(missile.disableWasCalled());
    }

    @Test
    void givenExpiredLaunchCodes_MissileIsNotLaunched_Mock() {
        MockMissile mockMissile = new MockMissile();

        Launcher.launchMissile(mockMissile, new ExpiredLaunchCode());

        mockMissile.verifyCodeRedAbort();
    }

    @Test
    void givenUnsignedLaunchCodes_MissileIsNotLaunched_Mock() {
        MockMissile mockMissile = new MockMissile();

        Launcher.launchMissile(mockMissile, new UnsignedLaunchCode());

        mockMissile.verifyCodeRedAbort();
    }

    @Test
    void givenGoodLaunchCodes_MissileIsLaunched() {
        SpyMissile missile = new SpyMissile();

        Launcher.launchMissile(missile, new GoodLaunchCode());

        assertTrue(missile.launchWasCalled());
        assertFalse(missile.disableWasCalled());
    }
}
