package missile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LauncherTest {
    @Test
    void givenExpiredLaunchCodes_MissileIsNotLaunched() {
        Launcher.launchMissile(new DummyMissile(), new ExpiredLaunchCode());
    }

    @Test
    void givenValidLaunchCodes_MissileIsLaunched() {
        
    }
}
