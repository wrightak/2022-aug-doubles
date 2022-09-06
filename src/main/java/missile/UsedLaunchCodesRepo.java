package missile;

public interface UsedLaunchCodesRepo {
    boolean contains(LaunchCode launchCode);

    void add(LaunchCode launchCode);
}
