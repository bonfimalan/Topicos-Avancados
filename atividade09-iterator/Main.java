import restaurant.DinerMenu;
import restaurant.PancakeHouseMenu;
import restaurant.Waitress;

public class Main {
    public static void main(String[] args) {
        var waitress = new Waitress(new PancakeHouseMenu(), new DinerMenu());
        waitress.printMenu();
    }
}