package day05;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Lottery {

    private final int numberOfNumbers;
    private final int maxNumber;

    public Lottery(int numberOfNumbers, int maxNumber) {
        if (numberOfNumbers < 1 || maxNumber < 1) {
            throw new IllegalArgumentException("invalid parameter");
        }
        this.numberOfNumbers = numberOfNumbers;
        this.maxNumber = maxNumber;
    }

    public Set<Integer> getLottaryNumbers() {
        Random random = new Random();
        Set<Integer> result = new HashSet<>();
        while (result.size() != numberOfNumbers) {
            result.add(random.nextInt(maxNumber) + 1);
        }
        return result;
    }

}
