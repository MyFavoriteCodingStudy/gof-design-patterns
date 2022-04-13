package ch1_Abstract_Factory.topping.dough;

public abstract class Dough {
    String name;
    String type;

    @Override
    public String toString() {
        return "Cheese{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
