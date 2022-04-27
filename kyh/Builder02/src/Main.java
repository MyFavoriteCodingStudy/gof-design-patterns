import blueprint.AsusGogStrixBluePrint;
import blueprint.ComputerFactory;
import blueprint.LgGramBluePrint;

public class Main {
    public static void main(String[] args) {
        ComputerFactory factory = ComputerFactory.getInstance();
        factory.setBluePrint(new LgGramBluePrint());
        System.out.println(factory.makeAndGet().toString());

        factory.setBluePrint(new AsusGogStrixBluePrint());
        System.out.println(factory.makeAndGet().toString());
    }
}
