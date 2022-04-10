package ch1_Abstract_Factory.pizzaStore;

import ch1_Abstract_Factory.NYPizzaIngredientFactory;
import ch1_Abstract_Factory.PizzaIngredientFactory;
import ch1_Abstract_Factory.pizza.CheesePizza;
import ch1_Abstract_Factory.pizza.PepperoniPizza;
import ch1_Abstract_Factory.pizza.Pizza;


public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {

        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();


        if (type.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("peppernoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        } else {
            return null;
        }

        return pizza;
    }
}
