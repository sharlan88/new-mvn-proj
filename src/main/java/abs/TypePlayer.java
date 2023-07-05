package abs;

public class TypePlayer extends Player  {
    @Override
    public void play() {
        System.out.println("Start type record");
    }

    @Override
    public void play(int numberOfSong) {

    }

    @Override
    public void stop() {
        System.out.println("Stop type record");
    }
}
