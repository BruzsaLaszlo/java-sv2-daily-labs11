package day04;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private List<Buyable> buyables = new ArrayList<>();
    private List<User> users = new ArrayList<>();

    public void buy(String nameOfUser, String nameOfBuyable) {
        var user = findUser(nameOfUser);
        var buyable = findBuyable(nameOfBuyable).getCopy();
        if (buyable.getPrice() * 3 <= user.getMoney()
                && buyable instanceof CanExtendWarrianty cew) {
            cew.setThreeYearGarantee();
            cew.setPrice((int) (buyable.getPrice() * 1.1));
        }
        user.buy(buyable);
    }

    private User findUser(String name) {
        return users.stream()
                .filter(user -> user.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }

    private Buyable findBuyable(String nameOfBuyable) {
        return buyables.stream()
                .filter(buyable -> buyable.getName().equals(nameOfBuyable))
                .findFirst()
                .orElseThrow();
    }

}
