package src.RandomNum;

import java.util.concurrent.ThreadLocalRandom;

public class Random {

    public static void main(String[] args) {

        int number = ThreadLocalRandom.current().nextInt(1, 101);
        System.out.println(number);
    }
}
