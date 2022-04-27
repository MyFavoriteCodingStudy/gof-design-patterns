package singleton;

/**
 * Thread safe Lazy initialization + Double-checked locking
 *  - Thread safe Lazy initialization 에서 많은 쓰레드들이 동시에 synchronized 처리된 메서드를 접근하면 성능저하가 발생하니
 *    이를 좀 더 완화시키기 위해 Double-checked locking 기법을 사용
 *  - 첫 번째 if 문에서 instance 가 null 인 경우 synchronized 블럭에 접근하고 한번 더 if 문으로 instance 가 null 유무를 체크 함
 *    2번 모두 다 instance 가 null 인 경우에 new 를 통해 인스턴스화 시키고, 그 후에 instance 가 null 이 아니기 때문에 synchronized
 *    블럭을 타지 않음
 */
public class ThreadSafeLazyInitializationDoubleCheckedLocking {
    private static ThreadSafeLazyInitializationDoubleCheckedLocking instance;

    private ThreadSafeLazyInitializationDoubleCheckedLocking() {}

    public static ThreadSafeLazyInitializationDoubleCheckedLocking getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeLazyInitializationDoubleCheckedLocking.class) {
                if (instance == null) {
                    instance = new ThreadSafeLazyInitializationDoubleCheckedLocking();
                }
            }
        }

        return instance;
    }
}