package missile;

public class GoodLaunchCode implements LaunchCode {
    @Override
    public boolean isExpired() {
        return false;
    }
}
