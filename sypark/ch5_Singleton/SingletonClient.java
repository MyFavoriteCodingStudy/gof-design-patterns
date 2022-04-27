public class SingletonClient {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        // System.out.println(new Singleton()); error
    }
}