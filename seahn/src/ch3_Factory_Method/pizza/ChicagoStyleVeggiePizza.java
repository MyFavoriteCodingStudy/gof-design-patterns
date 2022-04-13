package ch3_Factory_Method.pizza;

public class ChicagoStyleVeggiePizza extends Pizza{
    public ChicagoStyleVeggiePizza() {
        name = "Chicago Cheese Pizza";
        dough = "Thick Curst Dough";
        sauce = "Plum Tomato Sause";

        toppings.add("모짜렐라 치즈");
        toppings.add("파슬리");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
