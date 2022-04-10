package ch3_Factory_Method;

import ch3_Factory_Method.pizza.Pizza;
import ch3_Factory_Method.pizzaStore.ChicagoPizzaStore;
import ch3_Factory_Method.pizzaStore.NYPizzaStore;
import ch3_Factory_Method.pizzaStore.PizzaStore;

public class PizzaCreateTest {
    public static void main(String[] args) {
        PizzaStore NYPizzaStore = new NYPizzaStore();
        PizzaStore ChicagoPizzaStore = new ChicagoPizzaStore();

        Pizza pizza1 = NYPizzaStore.orderPizza("cheese");
        System.out.println("order success: " + pizza1.getName() + "\n");

        Pizza pizza2 = ChicagoPizzaStore.orderPizza("peppernoni");
        System.out.println("order success: " + pizza2.getName() + "\n");
    }
}
