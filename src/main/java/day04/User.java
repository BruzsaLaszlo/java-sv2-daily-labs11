package day04;

import java.util.ArrayList;
import java.util.List;

public class User {

    private String name;
    private List<Buyable> buyables = new ArrayList<>();
    private int money;

    public User(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public boolean buy(Buyable buyable) {
        if (buyable.getPrice() <= money) {
            money -= buyable.getPrice();
            return buyables.add(buyable);
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public List<Buyable> getBuyables() {
        return List.copyOf(buyables);
    }

    public int getMoney() {
        return money;
    }
}
