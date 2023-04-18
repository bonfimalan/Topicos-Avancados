package devices;

public class TheaterLights {
    public void on() {
        System.out.println("Theater Lights on 💡");
    }

    public void off() {
        System.out.println("Theater Lights off 💡");
    }

    public void dim(int i) {
        System.out.printf("Theater Lights dimmed in %d%% 💡\n", i);
    }
}
