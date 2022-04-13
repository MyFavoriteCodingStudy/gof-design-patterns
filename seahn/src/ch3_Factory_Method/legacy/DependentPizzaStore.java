package ch3_Factory_Method.legacy;

import ch3_Factory_Method.pizza.*;

public class DependentPizzaStore {

    public Pizza createPizzaStore(String storeName, String pizzaType) {
        Pizza pizza = null;

        if (storeName.equals("NY")) {
            if (pizzaType.equals("cheese")) {
                pizza = new NYStyleCheesePizza();
            } else if (pizzaType.equals("peppernoni")) {
                pizza =  new NYStylePeppernoniPizza();
            } else if (pizzaType.equals("veggie")) {
                pizza =  new NYStyleVeggiePizza();
            } else {
                return null;
            }
        } else if(storeName.equals("Chicago")) {
            if (pizzaType.equals("cheese")) {
                pizza =  new ChicagoStyleCheesePizza();
            } else if (pizzaType.equals("peppernoni")) {
                pizza =  new ChicagoStylePeppernoniPizza();
            } else if (pizzaType.equals("veggie")) {
                pizza =  new ChicagoStyleVeggiePizza();
            } else {
                return null;
            }
        } else {
            System.out.println("invalid type of pizza");
            return null;
        }

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
