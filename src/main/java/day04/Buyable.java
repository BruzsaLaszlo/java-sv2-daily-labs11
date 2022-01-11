package day04;

import java.time.LocalDate;

public interface Buyable {

    String getName();

    int getPrice();

    LocalDate getExpriration();

    Buyable getCopy();

}
