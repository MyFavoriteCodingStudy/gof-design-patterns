package win;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class WinGuiFac implements GuiFac {
    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public TextArea createTextArea() {
        return new WinTextArea();
    }
}
