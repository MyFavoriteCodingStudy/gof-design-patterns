package abstract_factory.factory;

import abstract_factory.buttons.Button;
import abstract_factory.buttons.MacOSButton;
import abstract_factory.checkboxes.Checkbox;
import abstract_factory.checkboxes.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
