package day05;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LotteryTest {

    @Test
    void getLottaryNumbers() {

        Lottery lottery = new Lottery(5,90);
        var result = lottery.getLottaryNumbers();

        assertEquals(5, result.size());

        for (Integer i : result) {
            assertTrue(i >= 1 && i <= 90);
        }
    }

    @Test
    void testInvalidParameters() {

        assertThrows(IllegalArgumentException.class, () -> new Lottery(0, 10));

        assertThrows(IllegalArgumentException.class, () -> new Lottery(10, 0));

    }
}