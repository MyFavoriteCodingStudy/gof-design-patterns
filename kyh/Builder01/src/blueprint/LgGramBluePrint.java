package blueprint;

import vo.Computer;

public class LgGramBluePrint extends BluePrint {
    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    public void setCpu() {
        computer.setCpu("i7");
    }

    @Override
    public void setRam() {
        computer.setRam("16g");
    }

    @Override
    public void setStorage() {
        computer.setStorage("256g");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
