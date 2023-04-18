package devices;

public class Amplifier {
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;

    public void on() {
        System.out.println("Amplifier on 📢");
    }

    public void off() {
        System.out.println("Amplifier off 📢");
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }

    public void setCd(CdPlayer cd) {
        this.cd = cd;
    }

    public void setTuner(Tuner tuner) {
        this.tuner = tuner;
    }

    public void setStereoSound() {
        System.out.println("Amplifier setted to stereo sound 🔊🔊");
    }

    public void setSurroundSound() {
        System.out.println("Amplifier setted to surround sound 🔊");
    }

    public void setVolume(int volume) {
        System.out.printf("Setted Amplifier volume to %d 🔊\n", volume);
    }
}
