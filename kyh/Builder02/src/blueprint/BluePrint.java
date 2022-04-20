package blueprint;

import vo.Computer;

public abstract class BluePrint {
    protected Computer computer;

    public BluePrint create() {
        computer = new Computer();
        return this;
    }

    public Computer build() {
        return computer;
    }

    public abstract BluePrint setCpu();
    public abstract BluePrint setRam();
    public abstract BluePrint setStorage();
}
