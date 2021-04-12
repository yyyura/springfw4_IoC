package ie.yyyura.springfw;

public class PlayerStrongDependency {

    private MusicOnlyOne musicOnlyOne;

    public void play() {
        // Strong Dependency, zatochen tolko na odin class
        musicOnlyOne = new MusicOnlyOne();
    }
}
