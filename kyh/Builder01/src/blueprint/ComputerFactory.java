package blueprint;

import vo.Computer;

public class ComputerFactory {
    private BluePrint bluePrint;

    private ComputerFactory() { }

    private static class SingletonHolder {
        private static final ComputerFactory INSTANCE = new ComputerFactory();
    }

    public static ComputerFactory getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void setBluePrint(BluePrint bluePrint) {
        this.bluePrint = bluePrint;
    }

    public Computer makeAndGet() {
        bluePrint.setCpu();
        bluePrint.setRam();
        bluePrint.setStorage();

        return bluePrint.getComputer();
    }
}
