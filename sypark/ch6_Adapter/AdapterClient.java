
public class AdapterClient {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        MallardTurkey turkey = new MallardTurkey();
        // Duck으로 터키 메소드 쓰고싶을 때 사용.
        Duck adapter = new TurkeyAdapter(turkey);

        testDuck(adapter);
    }

    public static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}