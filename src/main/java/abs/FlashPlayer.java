package abs;

public class FlashPlayer extends Player  {
    @Override
    public void play() {
        System.out.println("Start track from Flash memory");
    }

    @Override
    public void play(int numberOfSong) {

    }

    @Override
    public void stop() {
        System.out.println("Stop track from Flash memory");
    }
}
