package missile;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FakeUsedLaunchCodesRepoTest {

    @Test
    public void addLaunchCode_containsTrue() {
        FakeUsedLaunchCodesRepo fakeUsedLaunchCodesRepo = new FakeUsedLaunchCodesRepo();
        LaunchCode launchCode = new GoodLaunchCode();

        fakeUsedLaunchCodesRepo.add(launchCode);

        assertTrue(fakeUsedLaunchCodesRepo.contains(launchCode));
    }

    @Test
    void notAddLaunchCode_containsFalse() {
        FakeUsedLaunchCodesRepo fakeUsedLaunchCodesRepo = new FakeUsedLaunchCodesRepo();
        LaunchCode launchCode = new GoodLaunchCode();


        assertFalse(fakeUsedLaunchCodesRepo.contains(launchCode));
    }

    @Test
    void addDifferentLaunchCode_containsFalse() {
        FakeUsedLaunchCodesRepo fakeUsedLaunchCodesRepo = new FakeUsedLaunchCodesRepo();
        LaunchCode launchCode = new GoodLaunchCode();

        fakeUsedLaunchCodesRepo.add(launchCode);

        LaunchCode differentLaunchCode = new GoodLaunchCode();
        assertFalse(fakeUsedLaunchCodesRepo.contains(differentLaunchCode));
    }
}
