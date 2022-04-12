package ch4_Prototype.legacy;

import ch4_Prototype.pizza.Pizza;

public class LegacyPizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new Pizza();
        pizza.makePizzaToppingList();

        Pizza newPizza1 = new Pizza();
        newPizza1.makePizzaToppingList();

        Pizza newPizza2 = new Pizza();
        newPizza2.makePizzaToppingList();

        newPizza1.getPizzaToppingList().add("gorgonzola");
        newPizza2.getPizzaToppingList().add("pineapple");

        System.out.println(pizza);
        System.out.println(newPizza1);
        System.out.println(newPizza2);
    }
}
