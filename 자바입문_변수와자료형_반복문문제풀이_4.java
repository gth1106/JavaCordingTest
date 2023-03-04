
public class 자바입문_변수와자료형_반복문문제풀이_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Q1 operator 값이 + , - , * , / 인 경우에 사칙연산을 수행하는 프로그램을 if-else switch 문을 사용
		int num1 =10;
		int num2 =2;
		char operator = '+';
		
		// Q2 구구단 짝수단만 출력
		
		for(int i=2;i<=9;i++) {
			if(i%2!=0)
				continue;
			for(int j=1;j<=9;j++) {
				System.out.println(i+"x"+j+"="+i*j);
				
			}
		}
		// Q3 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들자
		for(int i=2;i<=9;i++) {
			
			for(int j=1;j<=9;j++) {
				if(i<=j)
					break;
					
					
				System.out.println(i+"x"+j+"="+i*j);
				
			}
		}
		// Q4 반복문 사용 별출력하기
		for(int i=1;i<5;i++) {
			System.out.println();
			
			for(int j=1;j<6;j++) {
				System.out.print(" ");
				if(i%2==0)
					continue;
				
				System.out.print("*");
				
			}
		}
		

	}

}
