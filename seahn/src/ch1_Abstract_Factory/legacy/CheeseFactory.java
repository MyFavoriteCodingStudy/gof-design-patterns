package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.topping.cheese.ChedaCheese;
import ch1_Abstract_Factory.topping.cheese.Cheese;
import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.Dough;
import ch1_Abstract_Factory.topping.dough.ThickCrustDough;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;
import ch1_Abstract_Factory.topping.sauce.Sauce;

public class CheeseFactory{

    public CheeseFactory() {}

    public Cheese selectCheese(String pizzaStoreName) {
        if (pizzaStoreName.equals("store1")) {
            return new RegianoCheese();
        } else if (pizzaStoreName.equals("store2")) {
            return new ChedaCheese();
        } else {
            System.out.println("error:  Invalid Store");
        }
        return null;
    }
}
