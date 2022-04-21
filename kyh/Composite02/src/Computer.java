import java.util.ArrayList;
import java.util.List;

public class Computer extends ComputerDevice {
    private List<ComputerDevice> components = new ArrayList<>();

    public void addComponent(ComputerDevice component) {
        components.add(component);
    }

    public void removeComponent(ComputerDevice component) {
        components.remove(component);
    }

    @Override
    public int getPrice() {
        int totPrice = 0;
        for (ComputerDevice component: components) {
            totPrice += component.getPrice();
        }
        return totPrice;
    }

    @Override
    public int getPower() {
        int totPower = 0;
        for (ComputerDevice component: components) {
            totPower += component.getPower();
        }
        return totPower;
    }
}
