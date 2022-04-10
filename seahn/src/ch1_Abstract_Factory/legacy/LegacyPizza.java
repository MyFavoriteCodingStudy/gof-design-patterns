package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.topping.cheese.Cheese;
import ch1_Abstract_Factory.topping.cheese.RegianoCheese;
import ch1_Abstract_Factory.topping.dough.Dough;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.MarinaraSauce;
import ch1_Abstract_Factory.topping.sauce.Sauce;

import java.util.ArrayList;

public class LegacyPizza {
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;

    /**
     dough, sauce, cheese의 값을 변경할 수 없는 문제 발생
      - PizzaIngredient 객체를 사용해 파라미터로 변수를 채우는 방법을 생각할 수 있다.
        - 여기서 문제점은
     */
    public void prepare(String pizzaName) {

    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into 8 slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }
}
