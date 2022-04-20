package singleton;

/**
 * Lazy initialization (늦은 초기화 방식)
 *  - Eager initialization 과 정반대로 클래스가 로딩되는 시점이 아닌 클래스의 인스턴스가 사용되는 시점에서 싱글톤 인스턴스를 생성
 *  - 사용시점까지 싱글톤 객체 생성을 미루기 때문에 사용하기 전까지 메모리를 점유하지 않음
 *
 * 장점: 싱글톤 객체가 필요할 때 인스턴스를 얻을 수 있다. Eager initialization 방식의 단점을 보완할 수 있음 (메모리 누수 방지)
 *
 * 단점: Multi-thread 환경에서 여러 곳에서 동시에 getInstance() 를 호출할 경우 인스턴스가 두 번 생성될 여지가 있음
 */
public class LazyInitialization {
    private static LazyInitialization instance;

    private LazyInitialization() {}

    public static LazyInitialization getInstance() {
        if (instance == null) {
            instance = new LazyInitialization();
        }
        return instance;
    }
}
