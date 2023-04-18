package devices;

public class CdPlayer {
    private Amplifier amplifier;

    public void on() {
        System.out.println("CD Player on 💿");
    }

    public void off() {
        System.out.println("CD Player off 💿");
    }

    public void eject() {
        System.out.println("CD Player ejected cd 💿");
    }

    public void pause() {
        System.out.println("CD Player paused audio 💿");
    }

    public void play() {
        System.out.println("CD Player playing audio 💿");
    }

    public void stop() {
        System.out.println("CD Player stopped audio 💿");
    }
}
