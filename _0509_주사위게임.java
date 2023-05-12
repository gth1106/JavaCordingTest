package workspace;
import java.util.*;
//import java.util.Random;
class DiceGame {
	public void startPlaying() {
		
	}
}
public class _0509_주사위게임 {

	private static int userGuess;
	private static int diceFace;

	public static void main(String[] args) {
		//주사위게임 사용자가 주사위를 굴렸을때 예측하는 값을
		// getUserInput
		//입력하고 실제 주사위를 굴렸을때
		// RollDice()
		//나오는 값을 맞추는게임
		// checkUserGuess
		DiceGame game = new DiceGame();
		game.startPlaying();
		getUserInput();
		RollDice();
		checkUserGuess();

	}
	private static void getUserInput() {
			
			System.out.print("예상값을 입력하세요 : ");
			Scanner input = new Scanner(System.in);
			userGuess = input.nextInt();
		}
	private static void checkUserGuess() {
		if (diceFace == userGuess) {
			System.out.println("실제값: "+ diceFace+" 맞았습니다.");
		}
		else {
			System.out.println("실제값: "+ diceFace+" 틀렸습니다.");
		}
		
	}

	private static void RollDice() {
		diceFace = (int)(Math.random()*6)+1 ;
		
	}

	

}

