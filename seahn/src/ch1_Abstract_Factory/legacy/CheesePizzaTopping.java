package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.PizzaIngredientFactory;
import ch1_Abstract_Factory.pizza.Pizza;
import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;

public class CheesePizzaTopping extends LegacyPizza {

    @Override
    public void prepare() {
        name   = "cheesePizza";
        dough  = new ThinCrustDough();
        sauce  = new MarinaraSauce();
        cheese = new RegianoCheese();
    }
}
