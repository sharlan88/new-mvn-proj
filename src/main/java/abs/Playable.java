package abs;

// 100 % abstract class.
public interface Playable {

    // public abstract by default
    void play();
    void play(int numberOfSong);

    public abstract void stop();


    // by default the filed is public and static final (constant)
    double PI = 3.14;

    public static final double X = 0.99;
}
