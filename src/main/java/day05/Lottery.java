package day05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {

    private final int numberOfNumber;
    private final int maxNumber;

    public Lottery(int numberOfNumber, int maxNumber) {
        if (numberOfNumber < 1 || maxNumber < 1) {
            throw new IllegalArgumentException("invalid parameter");
        }
        this.numberOfNumber = numberOfNumber;
        this.maxNumber = maxNumber;
    }

    public Set<Integer> getLottaryNumbers() {
        Random random = new Random();
        Set<Integer> result = new HashSet<>();
        while (result.size() == numberOfNumber) {
            result.add(random.nextInt(maxNumber) + 1);
        }
        return result;
    }

}
