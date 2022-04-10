package ch2_Builder.builder;

public class BuilderTest {
    public static void main(String[] args) {
        PizzaStore pizzaStore1 = new PizzaStore(
                        "pizza school","01012341234","서울시 송파구",
                        new String[]{"cheese","pepperoni"},"09:00","21:00");

        PizzaStore pizzaStore2 = new PizzaStoreBuilder()
                .setName("pizza school")
                .setTelNo("01012341234")
                .setLocation("서울시 송파구")
                .setMenus(new String[]{"cheese","pepperoni"})
                .setOpenTime("09:00")
                .setCloseTime("21:00")
                .build();

        PizzaStore pizzaStore3 = new PizzaStoreBuilder()
                .setName("pizza school")
                .setTelNo("01012341234")
                .setLocation("서울시 송파구")
                .setMenus(new String[]{"cheese","pepperoni"})
                .build();

        System.out.println(pizzaStore1);
        System.out.println(pizzaStore2);
        System.out.println(pizzaStore3);

    }
}
