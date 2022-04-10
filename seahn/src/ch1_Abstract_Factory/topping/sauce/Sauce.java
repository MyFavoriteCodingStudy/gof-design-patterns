package ch1_Abstract_Factory.topping.sauce;

public abstract class Sauce {
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
