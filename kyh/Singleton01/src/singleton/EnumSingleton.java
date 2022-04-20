package singleton;

/**
 * Enum initialization (Enum 초기화)
 *  - 모든 enum type 들은 프로그램 내에서 한번 초기화되는 점을 이용해 싱글톤을 구현
 *    클래스 로딩 시점에 static 블럭에서 싱글톤 객체인 INSTANCE 에 초기화
 *  - 장점은 Eager initialization 과 동일
 */
public enum EnumSingleton {
    INSTANCE;
    public void execute() {

    }
}
