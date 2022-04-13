package abstract_factory.buttons;

public class MacOSButton implements abstract_factory.buttons.Button {

    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}