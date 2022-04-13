package ch3_Factory_Method.pizza;

public class NYStylePeppernoniPizza extends Pizza{
    public NYStylePeppernoniPizza(){
        name = "New York Peppernoni Pizza";
        dough = "Thin Curst Dough";
        sauce = "Marinara Sause";

        toppings.add("체다 치즈");
        toppings.add("페퍼로니");   
    }
}
