package abstract_factory.checkboxes;

import abstract_factory.buttons.Button;

public interface GUIFactory {
    Button createButton();
    abstract_factory.heckboxes.Checkbox createCheckbox();
}
