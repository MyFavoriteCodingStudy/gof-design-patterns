package ch1_Abstract_Factory.pizza;

import ch1_Abstract_Factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{

    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        super.dough = pizzaIngredientFactory.createDough();
        super.sauce = pizzaIngredientFactory.createSauce();
        super.cheese = pizzaIngredientFactory.createCheese();
    }
}
