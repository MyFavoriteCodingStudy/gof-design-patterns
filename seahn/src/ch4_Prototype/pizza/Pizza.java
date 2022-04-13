package ch4_Prototype.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Cloneable{

    private String name;
    private List<String> pizzaToppingList;

    public Pizza() {
        this.pizzaToppingList = new ArrayList<>();
    }

    public Pizza(List<String> pizzaToppingList) {
        this.pizzaToppingList = pizzaToppingList;
    }

    public List<String> getPizzaToppingList() {
        return pizzaToppingList;
    }

    public void makePizzaToppingList() {
        this.pizzaToppingList.add("cheese");
        this.pizzaToppingList.add("ham");
        this.pizzaToppingList.add("tomato");
        this.pizzaToppingList.add("potato");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException{
        Pizza newPizza = (Pizza) super.clone();
        newPizza.pizzaToppingList = new ArrayList<>(this.pizzaToppingList);
        return newPizza;
    }

    @Override
    public String toString() {
        return pizzaToppingList.toString();
    }
}
