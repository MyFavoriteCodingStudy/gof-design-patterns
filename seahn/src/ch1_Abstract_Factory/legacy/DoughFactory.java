package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.PizzaIngredientFactory;
import ch1_Abstract_Factory.pizza.Pizza;
import ch1_Abstract_Factory.topping.cheese.Cheese;
import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.Dough;
import ch1_Abstract_Factory.topping.dough.ThickCrustDough;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;
import ch1_Abstract_Factory.topping.sauce.Sauce;

public class DoughFactory {

    public DoughFactory() {}

    public Dough selectDough(String pizzaStoreName) {
        if (pizzaStoreName.equals("store1")) {
            return new ThinCrustDough();
        } else if (pizzaStoreName.equals("store2")) {
            return new ThickCrustDough();
        } else {
            System.out.println("error:  Invalid Store");
        }
        return null;
    }
}
