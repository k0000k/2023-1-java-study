package src;

import src.Car;
import src.Move;

import java.util.ArrayList;
import java.util.Scanner;

public class RacingCars {

    private final ArrayList<Car> cars;

    public RacingCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void allCarsIntroduce() {
        System.out.println("\n-----경기 참가자 소개-----");
        for (Car car : cars) {
            car.introduce();
        }
    }

    public void racing(Move move) {
        System.out.println("\n경기를 몇 초 동안 진행할까요?");
        Scanner scanner = new Scanner(System.in);
        int sec = scanner.nextInt();

        for (int i = 0; i < sec; i++) {
            for (Car car: cars) {
                if (move.go() == 1) {
                    car.go();
                }
            }
        }
        scanner.close();
    }

    public void result() {
        System.out.println("\n---최종 결과 발표---");
        for (Car car: cars) {
            car.sayScore();
        }
    }

}
