import facade.HomeTheaterFacade;

public class Main {
    public static void main(String[] args) {
        var facade = new HomeTheaterFacade();

        facade.watchMovie("Brenão Adventures");
        System.out.println();
        facade.endMovie();
    }
}