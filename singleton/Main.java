import static java.lang.Thread.sleep;

import chocolate.ChocolateBoiler;

public class Main {
    public static void main(String... args) throws Exception {
        Thread boil1 = boilThread();
        Thread boil2 = boilThread();
        boil1.start();
        boil2.start();
        boil1.join();
        boil2.join();
    }

    private static Thread boilThread() {
        return new Thread(() -> {
            try {
                ChocolateBoiler boiler = ChocolateBoiler.getInstance();
                boiler.fill();
                sleep(random());
                boiler.boil();
                sleep(random());
                boiler.drain();
            } catch (InterruptedException e) { }
        });
    }

    private static int random() {
        return (int) Math.random() * 200 + 100;
    }
}