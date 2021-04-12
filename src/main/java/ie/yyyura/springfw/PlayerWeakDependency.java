package ie.yyyura.springfw;

public class PlayerWeakDependency {

    private MusicInterface mi;

    public void play() {
        // Weak Dependency
        mi = new MusicClassical();
        mi = new MusicRock();
    }
}
