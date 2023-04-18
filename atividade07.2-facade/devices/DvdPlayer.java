package devices;

public class DvdPlayer {
    private Amplifier amplifier;

    public void on() {
        System.out.println("DVD Player on 📀");
    }

    public void off() {
        System.out.println("DVD Player off 📀");
    }

    public void eject() {
        System.out.println("DVD Player ejected dvd 📀");
    }

    public void pause() {
        System.out.println("DVD Player paused video 📀");
    }

    public void play(String movie) {
        System.out.printf("DVD Player playing %s 📀\n", movie);
    }

    public void setSurroundAudio() {
        System.out.println("DVD Player setted suround sound 📀🔊");
    }

    public void setTwoChannelAudio() {
        System.out.println("DVD Player setted two channel audio 📀🔊🔊");
    }

    public void stop() {
        System.out.println("DVD Player stopped video 📀");
    }
}
