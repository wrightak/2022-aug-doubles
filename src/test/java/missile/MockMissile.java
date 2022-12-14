package missile;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MockMissile implements Missile {
    private boolean launchWasCalled = false;
    private boolean disableWasCalled = false;

    @Override
    public void launch() {
        launchWasCalled = true;
    }

    @Override
    public void disable() {
        disableWasCalled = true;
    }

    void verifyCodeRed() {
        assertFalse(launchWasCalled);
        assertTrue(disableWasCalled);
    }

    void verifyLaunch() {
        assertTrue(launchWasCalled);
        assertFalse(disableWasCalled);
    }
}
