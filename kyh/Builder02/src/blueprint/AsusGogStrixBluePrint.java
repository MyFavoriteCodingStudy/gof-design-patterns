package blueprint;

public class AsusGogStrixBluePrint extends BluePrint {
    @Override
    public BluePrint setCpu() {
        computer.setCpu("Ryzen7 6800H");
        return this;
    }

    @Override
    public BluePrint setRam() {
        computer.setRam("16g");
        return this;
    }

    @Override
    public BluePrint setStorage() {
        computer.setStorage("1TB");
        return this;
    }
}
