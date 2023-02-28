
public class 자바입문_변수와자료형_기본연산자_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 사칙연산에서의 우선순위 처럼 프로그램에서는 '연산자 우선순위' 가 있다
		 * 대입 연산자 -> 왼쪽변수 = 오른쪽 변수(또는 식)
		 * 이항 연산자 중 우선순위가 가장 낮은 연산자이다.
		 * 산술 연산자
		 * + - *  /(몫 구하기)  %(나머지구하기) 
		 * 논리 연산자
		 * && || !(부정)
		 * %% 두 항이 모두 참일때 포인트는(앞항이 거짓이면 뒷항은 실행되지않는다.)
		 * || 논리 합에서 앞 항이 참이면 뒷 항이 실행되지않는다 뒷항값은 그대로
		 * 
		 * 복합 대입 연산자
		 * += -= *= /= %=
		 * <<= 비트를 왼쪽으로 이동하고 그 값을 왼쪽 항에 대입
		 * >>= 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입(왼쪽에 채워지는 비트 값은 부호 비트와 동일하다.)
		 * >>>= 비트를 오른쪽으로 이동하고 그 값을 왼쪽 항에 대입합니다(왼쪽에 채워지는 비트값은 0이다.)
		 * &= |= ^=
		 * 
		 * 조건 연산자 
		 * 연산에 필요한 항의 개수가 3개이다. (삼항 연산자)
		 * 
		 * 비트 논리 연산자
		 * & , | , ^ , ~
		 * &(AND) 연산자는 비트 값이 모두 1인 경우에만 연산의 결과 값이 1이 된다,
		 * 0&0 -> 0 
		 * 0&1 -> 0
		 * 1&0 -> 0
		 * 1&1 -> 1
		 * |(OR) 연산자는 비트 값이 하나라도 1이면 연산 결과 값이 1이 된다.
		 * 
		 * ^(XOR) 연산자는 같은 값이면 0, 다른 값이면 1의 결과 값을 갖는다.
		 * 
		 * ~(반전) 연산자는 비트 값을 0은 1로 , 1은 0으로 바꾸는 연산자이다.
		 * 
		 * 비트 이동 연산자 << , >> , >>>
		 *  n 비트 이동한다는 것은 기존 값에 2^^n 만큼 곱한다는 뜻이다.
		 *  
		 */
		int mathScore = 90;
		int engScore  = 70;
		int korScore  = 80;
		
		int totalScore = mathScore+engScore+korScore;
		int avg = totalScore/3;
		System.out.println(totalScore);
		System.out.println(avg);
		
		int num = 10 ;
		boolean isEven;
		isEven=(num%2==0) ? true : false ;
		
		System.out.println(isEven);
		
		int num1 = 5;
		num1 << 2 ;
		System.out.println(num1);
	}

}
