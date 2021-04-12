package ie.yyyura.springfw;

public class Player_IoC {

    private MusicInterface mi;

    // Zavisimost vnedrjaetsja izvne
    public Player_IoC(MusicInterface mi) {
        this.mi = mi;
    }

    public void play() {
        // IoC bolshe ne sozdajetsja objekt
        // Dependency Injection
        // ......
        // ......

    }
}
