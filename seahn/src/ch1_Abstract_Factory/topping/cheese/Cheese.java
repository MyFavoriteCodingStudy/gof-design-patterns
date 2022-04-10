package ch1_Abstract_Factory.topping.cheese;

public abstract class Cheese {
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
