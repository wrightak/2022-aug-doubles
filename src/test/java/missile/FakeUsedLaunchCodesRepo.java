package missile;

import java.util.HashSet;

public class FakeUsedLaunchCodesRepo implements UsedLaunchCodesRepo {
    private HashSet<LaunchCode> set = new HashSet<>();

    @Override
    public boolean contains(LaunchCode launchCode) {
        return set.contains(launchCode);
    }

    @Override
    public void add(LaunchCode launchCode) {
        set.add(launchCode);
    }
}
