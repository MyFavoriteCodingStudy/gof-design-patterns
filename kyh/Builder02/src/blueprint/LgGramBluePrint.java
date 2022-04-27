package blueprint;

public class LgGramBluePrint extends BluePrint {
    @Override
    public BluePrint setCpu() {
        computer.setCpu("i7");
        return this;
    }

    @Override
    public BluePrint setRam() {
        computer.setRam("16g");
        return this;
    }

    @Override
    public BluePrint setStorage() {
        computer.setStorage("256g");
        return this;
    }
}
