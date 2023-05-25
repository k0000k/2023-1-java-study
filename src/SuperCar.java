package src;

import src.Car;

import java.util.Random;

class SuperCar extends Car { // 인터페이스를 상속받는 방법이 좋음

    private int boosterCnt;
    private Random random; // 얘가 static이여도 될까요?

    public SuperCar(String name, int speed) {
        super(name, speed);
        this.boosterCnt = 0;
        long seed = System.currentTimeMillis();
        this.random = new Random(seed);
    }

    @Override
    public void go() {
        int random = this.random.nextInt(2);

        if (random == 0) {
            score += speed;
        }
        else {
            boosterCnt += 1;
            score += 2 * speed;
        }

    }

    @Override
    public void sayScore() {
        System.out.println("score: " + score + ", booster: " + boosterCnt);
    }

}