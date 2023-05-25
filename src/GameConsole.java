package src;

// randomGo와 의존적인 관계
public class GameConsole {
    private final RacingCars racingCars;

    public GameConsole() {
        Initializer initializer = new Initializer(); // 입출력을 GameConsole 밖으로 분리하기
        this.racingCars = initializer.generateCars();
    }

    public void runGame(Move move) { // 두개의 인터페이스를 받기 (의존적)
        racingCars.allCarsIntroduce(); // 별도의 메소드로 -> 콘솔의 역할(private으로)
        racingCars.racing(move);
        racingCars.result();
    }

    public static void main(String[] args) { // -> racingApp이 main
        GameConsole gameConsole = new GameConsole();
        RandomGo randomGo = new RandomGo();
        gameConsole.runGame(randomGo);
    }
}
