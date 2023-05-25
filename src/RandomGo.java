package src;

import src.Move;

import java.util.Random;

public class RandomGo implements Move {

    private final Random random;

    public RandomGo() {
        long seed = System.currentTimeMillis();
        this.random = new Random(seed);
    }

    @Override
    public int go() {
        return random.nextInt(2);
    }
}
