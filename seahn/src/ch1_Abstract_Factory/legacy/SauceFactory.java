package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.topping.cheese.Cheese;
import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.Dough;
import ch1_Abstract_Factory.topping.dough.ThickCrustDough;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;
import ch1_Abstract_Factory.topping.sauce.Sauce;
import ch1_Abstract_Factory.topping.sauce.TomatoSauce;

public class SauceFactory{

    public SauceFactory() {}

    public Sauce selectSauce(String pizzaStoreName) {
        if (pizzaStoreName.equals("store1")) {
            return new MarinaraSauce();
        } else if (pizzaStoreName.equals("store2")) {
            return new TomatoSauce();
        } else {
            System.out.println("error:  Invalid Store");
        }
        return null;
    }
}
