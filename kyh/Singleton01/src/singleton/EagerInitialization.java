package singleton;

/**
 * Eager initialization (이른 초기화 방식)
 *  - Singleton 의 가장 기본적인 방식
 *  - 클래스 내에 전역변수로 instance 변수를 생성하고 private static 을 사용하여 인스턴스화에 상관없이 접근이 가능하면서 동시에
 *    private 접근 제어 키워드를 사용해 EagerInitialization.instance 로 바로 접근 할 수 없도록 함
 *  - 또한, 생성자에도 private 접근 제어 키워드를 붙여 다른 클래스에서 new EagerInitialization() 방식으로 새로운 인스턴스를
 *    생성하는 것을 방지
 *  - 오직 정적 메서드인 getInstance() 메서드를 이용해서 인스턴스를 접근하도록 하여 유일무이한 동일 인스턴스를 사용
 *  - 싱글톤 객체를 미리 생성해 놓는 방식으로, 항상 싱글톤 객체가 필요하거나 객체 생성 비용이 크게 들어가지 않는 경우에 사용
 *
 * 장점: static 으로 생성된 변수에 싱글톤 객체를 선언했기 때문에 클래스 로더에 의해 클래스가 로딩될 때 싱글톤 객체가 생성
 *       클래스 로더에 의해 클래스가 최초 로딩될 때 객체가 생성됨으로 Thread-safe 함
 *
 * 단점: 싱글톤 객체 사용유무와 상관없이 클래스가 로딩되는 시점에 항상 싱글톤 객체가 생성되고, 메모리를 잡고 있기 때문에 비효율적일 수 있음
 */
public class EagerInitialization {
    private static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() { }

    public static EagerInitialization getInstance() {
        return instance;
    }
}
