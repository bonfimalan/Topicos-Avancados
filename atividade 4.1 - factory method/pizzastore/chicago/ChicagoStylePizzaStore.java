package pizzastore.chicago;

import pizza.Pizza;
import pizzastore.PizzaStore;
import pizzastore.PizzaType;

public class ChicagoStylePizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(PizzaType type) {
        switch(type) {
            case CHEESE: return new ChicagoStyleCheesePizza();
            case CLAM: return new ChicagoStyleClamPizza();
            case PEPPERONI: return new ChicagoStylePepperoniPizza();
            case VEGGIE: return new ChicagoStyleVeggiePizza();
            default: return null;
        }
    }
    
}
