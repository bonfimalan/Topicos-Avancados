package pizzastore.newyork;

import pizza.Pizza;
import pizzastore.PizzaStore;
import pizzastore.PizzaType;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(PizzaType type) {
        switch(type) {
            case CHEESE: return new NYStyleCheesePizza();
            case CLAM: return new NYStyleClamPizza();
            case PEPPERONI: return new NYStylePepperoniPizza();
            case VEGGIE: return new NYStyleVeggiePizza();
            default: return null;
        }
    }
}
