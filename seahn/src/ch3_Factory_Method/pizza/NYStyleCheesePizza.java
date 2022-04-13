package ch3_Factory_Method.pizza;

public class NYStyleCheesePizza extends Pizza{
    public NYStyleCheesePizza() {
        name = "New York Cheese Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sause";

        toppings.add("체다 치즈");
        toppings.add("파슬리");
    }
}
