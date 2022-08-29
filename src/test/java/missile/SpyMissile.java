package missile;

public class SpyMissile implements Missile {
    private boolean launchWasCalled = false;

    @Override
    public void launch() {
        launchWasCalled = true;
    }

    public boolean launchWasCalled() {
        return launchWasCalled;
    }
}
