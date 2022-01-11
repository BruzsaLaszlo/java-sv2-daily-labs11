package day04;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Service implements Buyable {

    private String name;
    private int price;
    private LocalDate expriration;

    @Override
    public Buyable getCopy() {
        return new Service(name, price);
    }

    private Service(String name, int price) {
        this.name = name;
        this.price = price;
        expriration = LocalDate.now().plus(1, ChronoUnit.YEARS);
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
