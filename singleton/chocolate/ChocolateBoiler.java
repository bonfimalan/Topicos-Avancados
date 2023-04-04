package chocolate;

import static java.util.Optional.ofNullable;

public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private static ChocolateBoiler singletonBoiler = new ChocolateBoiler();

    private ChocolateBoiler() {
        this.empty = true;
        this.boiled = true;
    }

    public static synchronized ChocolateBoiler getInstance() {
        return ofNullable(singletonBoiler)
                .orElseGet(() -> singletonBoiler = new ChocolateBoiler());
    }

    public synchronized void fill() {
        if(isEmpty()) {
            empty = false;
            boiled = false;
            System.out.println("Filling ⛽");
        }
        else {
            System.out.println("Already filled 🥤");
        }
    }

    public synchronized void drain() {
        if(!isEmpty() && isBoiled()) {
            empty = true;
            System.out.println("Draining 🫗");
        }
        else {
            System.out.println("Already drained 🫙");
        }
    }

    public synchronized void boil() {
        if(!isEmpty() && !isBoiled()) {
            boiled = true;
            System.out.println("Boiling ♨");
        }
        else {
            System.out.println("Already boiled 🔥");
        }
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
