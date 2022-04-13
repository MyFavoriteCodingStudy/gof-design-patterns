package abstract_factory.app;

import abstract_factory.factory.GUIFactory;
import abstract_factory.factory.MacOSFactory;
import abstract_factory.factory.WindowsFactory;

public class FamiliesOfCrossPlatformGUIComponentsAProduction {
    /**
     * Application picks the factory type and creates it in run time (usually at
     * initialization stage), depending on the configuration or environment
     * variables.
     */
    private static abstract_factory.app.Application configureApplication() {
        abstract_factory.app.Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
            app = new Application(factory);
        } else {
            factory = new WindowsFactory();
            app = new Application(factory);
        }
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}