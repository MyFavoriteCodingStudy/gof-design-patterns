package blueprint;

import vo.Computer;

public class AsusGogStrixBluePrint extends BluePrint {
    private Computer computer;

    public AsusGogStrixBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("Ryzen7 6800H");
    }

    @Override
    public void setRam() {
        computer.setRam("16G");
    }

    @Override
    public void setStorage() {
        computer.setStorage("1TB");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
