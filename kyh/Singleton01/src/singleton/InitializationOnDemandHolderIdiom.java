package singleton;

/**
 * Initialization on demand holder idiom (holder 에 의한 초기화)
 *  - 클래스안에 클래스(Holder)를 두어 JVM 의 Class Loader 매커니즘과 Class 가 로드되는 시점을 이용한 방법
 *  - Lazy initialization + thread safe
 *  - 중첩클래스 Holder 는 getInstance 메서드가 호출되기 전에는 참조되지 않으며, 최초로 getInstance 메서드가 호출될 때
 *    클래스 로더에 의해 싱글톤 객체를 생성하여 리턴 함 (Holder 안에 선언된 instance 가 static 이기 때문에 클래스 로딩 시점에
 *    한번만 호출된다는 점을 이용. 또 final 을 써서 재할당이 불가능하게 함)
 */
public class InitializationOnDemandHolderIdiom {
    private InitializationOnDemandHolderIdiom() {}

    private static final class SingletonHolder {  // class 에 대한 private 접근 제어자는 내부클래스에만 가능
        private static final InitializationOnDemandHolderIdiom instance = new InitializationOnDemandHolderIdiom();
    }

    public static InitializationOnDemandHolderIdiom getInstance() {
        return SingletonHolder.instance;
    }
}
