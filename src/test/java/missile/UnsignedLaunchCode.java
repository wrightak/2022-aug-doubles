package missile;

public class UnsignedLaunchCode implements LaunchCode {
    @Override
    public boolean isExpired() {
        return false;
    }

    @Override
    public boolean isSigned() {
        return false;
    }
}
