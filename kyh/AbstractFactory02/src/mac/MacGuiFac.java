package mac;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class MacGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public TextArea createTextArea() {
        return new MacTextArea();
    }
}
