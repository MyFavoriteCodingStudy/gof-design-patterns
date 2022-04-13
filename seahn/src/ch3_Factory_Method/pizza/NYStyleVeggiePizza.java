package ch3_Factory_Method.pizza;

import ch3_Factory_Method.pizzaStore.PizzaStore;

public class NYStyleVeggiePizza extends Pizza {
    public NYStyleVeggiePizza(){
        name = "New York Veggie Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sause";

        toppings.add("체다 치즈");
        toppings.add("Veggie");
    }
}