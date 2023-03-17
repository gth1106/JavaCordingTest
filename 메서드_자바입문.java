package classpart;

public class 메서드_자바입문 {
	// 함수란 ? 하나의 기능을 수행하는 일련의 코드
	
		// 함수 정의하기
		int add(int num1, int num2) {
			int result;
			result = num1+num2;
			return result;
		}
		/* 함수이름 add
		 * 매개변수 num1 num2 
		 * add() 함수를 수행한 후 결과 값은 변수 result 에 저장됩니다. 저장된 결과 값은 함수를 호출했을때 반환 되는 값이므로 '반환값' 이라고도 부릅니다.
		 * " 이 함수의 결과 값을 반환한다" 를 뜻하는 예약어는 return 이다.
		 * 반환값의 자료형을 반환형이라고 하는데  add 함수 앞에 써준다. 이때 result의 반환형은 정수형이므로 int 를 써줬다.
		 */ 
		// 매개변수가 필요 없는 함수도 있다
		int getTenTotal() {
			int i;
			int total = 0;
			for(i=1;i<=10;i++) {
				total+=i;
			}
			return total;
		}
		// 반환 값이 없는 함수도 있다. 반환 값이 없다고 해서 반환형을 쓰는 위치를 비워두면 오류가 발생하니 이때는 반환형 위치에 void 를 쓴다.
		// void 는 비어 있다는 의미로 "반환할 값이 없다" 라는 뜻의 예약어이다.
		void printGreeting(String name) {
			System.out.println(name + "님 안녕하세요");
			return ;
			
			}
		/* divide () 함수는 두 수를 매개변수로 전달받아서 나눗셈을 한 후 몫을 출력하는 함수이다.
		 * 나누는 수가 0이라면 수행하면안된다. 이경우에는 함수수행을 종료하는 !!!예약어 return !!! 을 사용한다.
		 */
		
		void devide(int num1, int num2) {
			if(num2==0) {
				System.out.println("나누는 수는 0이 될 수 없습니다.");
				return;
			}
		
		else {
			int result= num1/num2;
			System.out.println(num1+"/"+num2+"="+result+"입니다.");
			}
		}
















}


