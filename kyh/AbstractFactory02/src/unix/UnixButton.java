package unix;

import abst.Button;

public class UnixButton implements Button {
    @Override
    public void click() {
        System.out.println("유닉스 버튼");
    }
}
