import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Basket {
    private int ballNumber;
    public Basket() {
        this.ballNumber = 0;  // 초기화
    }
    public int getBallNumber() {
        return ballNumber;
    }
    public void setBallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
    }
}

class Game {
    private Basket[] baskets;
    public Game(int numberOfBaskets) {
        this.baskets = new Basket[numberOfBaskets];
        for (int i = 0; i < numberOfBaskets; i++) {
            baskets[i] = new Basket();
        }
    }
    public void setBasketsBall(int start, int end, int ballNumber) {
        for(int i=start; i<=end; i++) {
            baskets[i-1].setBallNumber(ballNumber);
        }
    }
    public void printBaskets() {
        for(Basket basket : baskets) {
            System.out.print(basket.getBallNumber() + " ");
        }
    }
}

public class 공넣기클래스분리 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = br.readLine().split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);

        Game game = new Game(N);

        for(int i=0; i<M; i++){
            String[] bline = br.readLine().split(" ");
            int a = Integer.parseInt(bline[0]);
            int b = Integer.parseInt(bline[1]);
            int c = Integer.parseInt(bline[2]);
            game.setBasketsBall(a, b, c);
        }

        game.printBaskets();
    }
}
