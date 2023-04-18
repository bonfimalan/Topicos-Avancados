package devices;

public class Tuner {
    private Amplifier amplifier;

    public void on() {
        System.out.println("Tuner on 📻");
    }

    public void off() {
        System.out.println("Tuner off 📻");
    }

    public void setAm() {
        System.out.println("Setted Tuner to AM 📻");
    }

    public void setFm() {
        System.out.println("Setted Tuner to FM 📻");
    }

    public void setFrequency(int frequency) {
        System.out.printf("Setted Tuner frequency to %d 📻", frequency);
    }
}
