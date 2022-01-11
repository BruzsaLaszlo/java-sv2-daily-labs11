package day04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Product implements Buyable, CanExtendWarrianty {

    private String name;
    private int price;
    private LocalDate expriration;


    @Override
    public Buyable getCopy() {
        return new Product(name, price);
    }

    private Product(String name, int price) {
        this.name = name;
        this.price = price;
        expriration = LocalDate.now().plus(3, ChronoUnit.MONTHS);
    }

    @Override
    public void setThreeYearGarantee() {
        expriration.plus(3, ChronoUnit.YEARS);
    }

    @Override
    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public LocalDate getExpriration() {
        return expriration;
    }
}
