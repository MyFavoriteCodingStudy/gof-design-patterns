package ch3_Factory_Method.pizzaStore;

import ch3_Factory_Method.pizza.NYStyleCheesePizza;
import ch3_Factory_Method.pizza.NYStylePeppernoniPizza;
import ch3_Factory_Method.pizza.NYStyleVeggiePizza;
import ch3_Factory_Method.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        } else if (type.equals("peppernoni")) {
            return new NYStylePeppernoniPizza();
        } else if (type.equals("veggie")) {
            return new NYStyleVeggiePizza();
        } else {
            return null;
        }
    }
}
