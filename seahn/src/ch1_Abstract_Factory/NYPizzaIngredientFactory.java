package ch1_Abstract_Factory;

import ch1_Abstract_Factory.topping.cheese.Cheese;
import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.Dough;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;
import ch1_Abstract_Factory.topping.sauce.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new RegianoCheese();
    }

//    @Override
//    public Veggies[] createVeggies() {
//        Veggies[] veggies = {new Garlic(), new Onion(), new MushRoom()};
//        return veggies;
//    }
}
