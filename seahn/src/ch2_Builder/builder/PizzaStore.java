package ch2_Builder.builder;

import java.util.Arrays;

public class PizzaStore {
    private String name;
    private String telNo;
    private String location;
    private String[] menus;
    private String openTime;
    private String closeTime;

    public PizzaStore(String name, String telNo, String location, String[] menus, String openTime, String closeTime){
        this.name = name;
        this.telNo = telNo;
        this.location = location;
        this.menus = menus;
        this.openTime = openTime;
        this.closeTime = closeTime;
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
