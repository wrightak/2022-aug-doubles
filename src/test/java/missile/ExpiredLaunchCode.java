package missile;

public class ExpiredLaunchCode extends GoodLaunchCode {
    @Override
    public boolean isExpired() {
        return true;
    }
}
