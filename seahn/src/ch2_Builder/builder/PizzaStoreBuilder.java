package ch2_Builder.builder;

import java.util.Arrays;

public class PizzaStoreBuilder {
    String name;
    String telNo;
    String location;
    String[] menus;
    String openTime;
    String closeTime;


    public PizzaStoreBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PizzaStoreBuilder setTelNo(String telNo) {
        this.telNo = telNo;
        return this;
    }

    public PizzaStoreBuilder setLocation(String location) {
        this.location = location;
        return this;
    }

    public PizzaStoreBuilder setMenus(String[] menus) {
        this.menus = menus;
        return this;
    }

    public PizzaStoreBuilder setOpenTime(String openTime) {
        this.openTime = openTime;
        return this;
    }

    public PizzaStoreBuilder setCloseTime(String closeTime) {
        this.closeTime = closeTime;
        return this;
    }

    public PizzaStore build() {
        PizzaStore pizzaStore = new PizzaStore(name, telNo, location, menus, openTime, closeTime );
        return pizzaStore;
    }

    @Override
    public String toString() {
        return "PizzaStore{" +
                "name='" + name + '\'' +
                ", telNo='" + telNo + '\'' +
                ", location='" + location + '\'' +
                ", menus=" + Arrays.toString(menus) +
                ", openTime='" + openTime + '\'' +
                ", closeTime='" + closeTime + '\'' +
                '}';
    }
}
