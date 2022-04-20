package unix;

import abst.Button;
import abst.GuiFac;
import abst.TextArea;

public class UnixGuiFac implements GuiFac {

    @Override
    public Button createButton() {
        return new UnixButton();
    }

    @Override
    public TextArea createTextArea() {
        return new UnixTextArea();
    }
}
