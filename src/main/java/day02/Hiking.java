package day02;

import java.util.List;

public class Hiking {

    public double getPlusElevation(List<Double> height) {
        double sum = 0;
        double last = height.get(0);

        for (double d : height) {
            if (d > last) {
                sum += d - last;
            }
            last = d;
        }

        return sum;
    }

}
