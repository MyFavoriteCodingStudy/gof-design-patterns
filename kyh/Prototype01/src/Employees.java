import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    /**
     * 데이터베이스에서 데이터를 로드하는 부분
     */
    public void loadData() {
        empList.add("Pankaj");
        empList.add("Raj");
        empList.add("David");
        empList.add("Lisa");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        /**
         * 1. 얕은 복사(Shallow Copy)
         *  - 객체를 복사할 때, 해당 객체만 복사하여 새 객체를 생성한다.
         *  - 복사된 객체의 인스턴스 변수는 원본 객체의 인스턴스 변수와 같은 메모리 주소를 참조한다.
         *  - 따라서, 해당 메모리 주소의 값이 변경되면 원본 객체 및 복사 객체의 인스턴스 변수 값은 같이 변경된다.
         *
         * 2. 깊은 복사(Deep Copy)
         *  - 객체를 복사할 때, 해당 객체와 인스턴스 변수까지 복사하는 방식
         *  - 전부를 복사하여 새 주소에 담기 때문에 참조를 공유하지 않는다.
         */
        List<String> temp = new ArrayList<>(this.empList);
        return new Employees(temp);
    }
}
