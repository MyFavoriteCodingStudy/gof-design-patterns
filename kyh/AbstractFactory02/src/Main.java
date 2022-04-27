import abst.Button;
import abst.GuiFac;
import abst.TextArea;
import concreate.FactoryInstance;

public class Main {
    public static void main(String[] args) {
        GuiFac fac = FactoryInstance.getGuiFac();
        Button button = fac.createButton();
        TextArea textArea = fac.createTextArea();

        button.click();
        System.out.println(textArea.getText());
    }
}
