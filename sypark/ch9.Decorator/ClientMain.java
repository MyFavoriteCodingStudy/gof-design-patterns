/**
 * (역할: Component : 실질적인 인스턴스를 컨트롤하는 역할)
 * Component인터페이스에서는
 * 재료들을 추가해주는 함수를 구현합니다.
 */
interface Component {
    String add(); // 재료 추가
}

/**
 * ConcreteComponent : Component의 실질적인 인스턴스 부분으로( Component 상속받아서 구현) 책임의 주체의
 * 역할
 * 
 * Component를 상속받아 커피의 기본 재료가 되는 에스프레소를 넣는것으로 정의.
 *
 */
class BaseConcreteComponent implements Component {

    @Override
    public String add() {
        // TODO Auto-generated method stub
        return "espresso";
    }

}

/**
 * Decorator는 Component랑 ConcreteDecorator를 동일시 하도록 해주는 역할.
 * 
 * 1) 각 데코레이터 안에는 Component객체가 들어있음. 즉, 구성요소에 대한
 * 레퍼런스가 들어있는 인스턴스 변수가 있음.
 * 2)데코레이터는 자신이 장식할 구성요소와 같은 인터페이스 or 추상클래스를 구현함.
 * 
 * Decorator는 커피의 재료들의 근간이 되는 추상클래스입니다. 재료들은 이 Decorator를 상속받아 재료를 추가합니다.
 * 
 */
abstract class Decorator implements Component {
    private Component coffeeComponent;

    public Decorator(Component coffeeComponent) {
        this.coffeeComponent = coffeeComponent;
    }

    public String add() {
        return coffeeComponent.add();
    }
}

/**
 * ConcreteDecoreator{n} : 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체
 * 
 * WaterDecorator는 물을 추가하는것으로 add메소드를 정의해듐.
 * 
 */

class WaterDecorator extends Decorator {

    public WaterDecorator(Component coffeeComponent) {
        super(coffeeComponent);
    }

    @Override
    public String add() {
        return super.add() + " + water";
    }
}

/**
 * ConcreteDecoreator{n} : 실질적인 장식 인스턴스 및 정의이며 추가된 책임의 주체
 * 
 * MilkDecorator는 물을 추가하는것으로 add메소드를 정의해듐.
 * 
 */

class MilkDecorator extends Decorator {

    public MilkDecorator(Component coffeeComponent) {
        super(coffeeComponent);
        // TODO Auto-generated constructor stub
    }

    @Override
    public String add() {
        return super.add() + " + milk";
    }
}

/**
 * 결론 : 자기가 감싸고 있는 구성요소의 메소드를 호출한 결과에 새로운 기능을 더함으로써 행동을 확장가능
 * 
 */
public class ClientMain {
    public static void main(String[] args) {
        Component espresso = new BaseConcreteComponent();
        System.out.println(espresso.add());

        Component americano = new WaterDecorator(new BaseConcreteComponent());
        System.out.println(americano.add());

        Component latte = new MilkDecorator(new WaterDecorator(new BaseConcreteComponent()));
        System.out.println(latte.add());
    }
}