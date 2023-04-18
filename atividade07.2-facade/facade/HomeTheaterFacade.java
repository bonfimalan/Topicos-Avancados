package facade;

import devices.Amplifier;
import devices.CdPlayer;
import devices.DvdPlayer;
import devices.PopcornPopper;
import devices.Projector;
import devices.Screen;
import devices.TheaterLights;
import devices.Tuner;

public class HomeTheaterFacade {
    private Amplifier amplifier;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public HomeTheaterFacade() {
        amplifier = new Amplifier();
        tuner = new Tuner();
        dvd = new DvdPlayer();
        cd = new CdPlayer();
        projector = new Projector();
        lights = new TheaterLights();
        screen = new Screen();
        popper = new PopcornPopper();
    }

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector,
            TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie 🎞");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting movie theater down");
        popper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
}
