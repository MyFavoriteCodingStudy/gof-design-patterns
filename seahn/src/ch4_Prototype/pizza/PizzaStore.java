package ch4_Prototype.pizza;

import java.util.List;

public class PizzaStore {
    public static void main(String[] args) throws CloneNotSupportedException{

        Pizza pizza = new Pizza();
        pizza.makePizzaToppingList();

        Pizza clonePizza1 = (Pizza) pizza.clone();
        Pizza clonePizza2 = (Pizza) pizza.clone();

        List<String> newPizza1 = clonePizza1.getPizzaToppingList();
        List<String> newPizza2 = clonePizza2.getPizzaToppingList();

        newPizza1.add("gorgonzola");
        newPizza2.add("pineapple");

        System.out.println(pizza);
        System.out.println(newPizza1);
        System.out.println(newPizza2);
    }
}
