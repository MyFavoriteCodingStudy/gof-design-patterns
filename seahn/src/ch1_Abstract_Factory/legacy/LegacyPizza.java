package ch1_Abstract_Factory.legacy;

import ch1_Abstract_Factory.topping.cheese.Cheese;
import ch1_Abstract_Factory.topping.dough.Dough;
import ch1_Abstract_Factory.topping.dough.ThinCrustDough;
import ch1_Abstract_Factory.topping.sauce.Sauce;

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

        DoughFactory doughFactory   = new DoughFactory();
        SauceFactory sauceFactory   = new SauceFactory();
        CheeseFactory cheeseFactory = new CheeseFactory();

        System.out.println("Preparing " + name);
        dough  = doughFactory.selectDough(pizzaName);
        sauce  = sauceFactory.selectSauce(pizzaName);
        cheese = cheeseFactory.selectCheese(pizzaName);
    }

}
