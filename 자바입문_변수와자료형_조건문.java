import java.util.Scanner;
public class 자바입문_변수와자료형_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* switch-case 문
		 * if 문이 번거로울 때 사용
		 * 
		 * switch(변수){
		 * 	case 값1 : 수행문1 = ' ' or 정수형 ;
		 *  	break;
		 *  이런형태
		 *   default : 수행문n = ' ' or 정수형;
		 *   }
		 *   P.103~ 중요 무조건 코딩해보기
		 * 
		 */
		
		//성적에 따라 학점부여하기
		Scanner sc =new Scanner(System.in);
		
		int score = sc.nextInt() ;
		char grade;
		if(score>=90) {
			grade='A';
			System.out.println(grade);
		}
		else if(score>=80) {
			grade='B';
			System.out.println(grade);
			
		}
		else if(score>=70) {
			grade='C';
			System.out.println(grade);
		}
		else if(score>=60) {
			grade='D';
			System.out.println(grade);
			
		}
		else
			System.out.println('F');
	}

}
