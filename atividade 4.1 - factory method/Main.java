import java.util.EnumSet;

import pizzastore.PizzaStore;
import pizzastore.PizzaType;
import pizzastore.chicago.ChicagoStylePizzaStore;
import pizzastore.newyork.NYStylePizzaStore;

public class Main {
    public static void main(String[] args) {
        orderAllType(new NYStylePizzaStore());

        orderAllType(new ChicagoStylePizzaStore());
    }

    public static void orderAllType(PizzaStore store) {
        EnumSet.allOf(PizzaType.class).forEach(
            type -> {
                store.orderPizza(type);
                System.out.println();
            }
        );
    }
}
