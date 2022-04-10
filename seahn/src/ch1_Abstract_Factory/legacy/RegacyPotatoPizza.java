package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;

public class RegacyPotatoPizza extends LegacyPizza {

    @Override
    public void prepare() {
        name   = "cheesePizza";
        dough  = new ThinCrustDough();
        sauce  = new MarinaraSauce();
        cheese = new RegianoCheese();
    }
}
