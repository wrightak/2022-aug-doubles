package missile;

public class ExpiredLaunchCode implements LaunchCode {
    @Override
    public boolean isExpired() {
        return true;
    }
}
