import java.util.*;
public class 자바_03_09_목요일_Add2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  상수 - 고정적 (프로그램이 실행되는동안 변하지 않는 상수
		 *  자바에서 만들어진 API 를 사용하여 입력받아 출력
		 */
		int sum ;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자를 입력하시오 :");
		int x=sc.nextInt();
		
		System.out.print("두번째 숫자를 입력하시오 :");
		int y=sc.nextInt();
		
		sum = x+y;
		
		System.out.println(sum);
	}//메인메소드의 끝

}//Add2 의 클래스의 끝
