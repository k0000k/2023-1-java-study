package src;

import src.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class Initializer { // 부스팅 인터페이스 받기

    public RacingCars generateCars() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차의 갯수를 입력하세요.");
        int cnt = scanner.nextInt();
        ArrayList<Car> cars = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            System.out.println((i + 1) + "번 째 자동차의 스피드를 입력하세요.");
            int speed = scanner.nextInt();

            System.out.println((i + 1) + "번 째 자동차의 이름을 입력하세요.");
            String name = scanner.next();

            System.out.println("이 자동차는 슈퍼카인가요? 0 또는 1 입력");
            int isSuper = scanner.nextInt();

            if (isSuper == 0) {
                Car car = new Car(name, speed);
                cars.add(car);
            }

            else {
                SuperCar car = new SuperCar(name, speed);
                cars.add(car);
            }
        }

        return new RacingCars(cars);
    }

}
