package singleton;

/**
 * Thread safe Lazy initialization (쓰레드 안전한 늦은 초기화)
 *  - Lazy initialization 방식에서 thread-safe 하지 않다는 단점을 보완하기 위해 멀티쓰레드에서 쓰레드들이 동시 접근하는
 *    동시성을 synchronized 키워드를 이용해 해결
 *
 * 장점: Lazy initialization 방식에서 thread-safe 하지 않은 점을 보완
 *
 * 단점: synchronized 키워드를 사용할 경우 자바 내부적으로 해당 영역이나 메서드를 lock, unlock 처리하기 때문에 많은 cost 가 발생
 *      많은 쓰레드들이 getInstance() 를 호출하게 되면 프로그램 전반적인 성능 저하가 발생
 */
public class ThreadSafeLazyInitialization {
    private static ThreadSafeLazyInitialization instance;

    private ThreadSafeLazyInitialization() {}

    public static synchronized ThreadSafeLazyInitialization getInstance() {
        if (instance == null) {
            instance = new ThreadSafeLazyInitialization();
        }

        return instance;
    }
}
