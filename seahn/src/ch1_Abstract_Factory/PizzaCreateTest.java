package ch1_Abstract_Factory;


import ch1_Abstract_Factory.pizza.Pizza;
import ch1_Abstract_Factory.pizzaStore.NYPizzaStore;
import ch1_Abstract_Factory.pizzaStore.PizzaStore;

public class PizzaCreateTest {
    public static void main(String[] args) {
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        pizzaIngredientFactory.createDough();
        pizzaIngredientFactory.createCheese();
        pizzaIngredientFactory.createSauce();

        PizzaStore NYPizzaStore = new NYPizzaStore();

        Pizza pizza1 = NYPizzaStore.orderPizza("cheese");
        System.out.println("order success: " + pizza1.toString() + "\n");
    }
}
