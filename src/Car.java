package src;

public class Car {
    protected String name;
    protected int speed;
    protected int score = 0;

    public Car(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void introduce() {
        System.out.println("스피드는 " + this.speed + "이고, 이름은 " + this.name + "입니다.");
    }

    public void go() {
        score += speed;
    }

    public void sayScore() {
        System.out.println("score: " + score);
    }
}