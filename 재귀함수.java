package 재귀;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 재귀함수 {		/* 함수 내에서 자기 자신을 호출하여 작업을 수행하는 방식의 함수
		 * 재귀함수를 작성할 때는 함수 내에서 자기 자신을 다시 호출한 후,
		 * 그 함수가 끝날 때까지 함수 호출 이후의 명령문이 수행되지 않는다는 사실과
		 * 종료 조건이 꼭 포함 되어야 한다는 부분을 인지하고 작성
		 * 실행을 마무리짓는 부분 ,  재귀를 실행하는 부분이 존재
		 * 
		 * ****
		 * BufferedReader에서 readLine()을 사용하는 경우에는 
		 * IOException이 발생할 수 있다면 이를 처리하기 위해 
		 * throws IOException을 사용하여 예외를 던져야 합니다.
		 *  또는 try-catch문을 이용하여 예외를 처리할 수도 있습니다
		 *  
		 *  또한 InputStreamReader는 바이트 기반 스트림에서 
		 *  문자 기반 스트림으로 변환하기 때문에, 
		 *  손상과 관련된 작업도 수행할 수 있습니다. 
		 *  즉, 입력된 데이터가 UTF-8 또는 EUC-KR과 같은 클라이클이 발생하는 경우에도 처리할 수 있습니다.
		 *  따라서 바이트 기반 스트림에서 
		 *  문자 기반 스트림으로 변환하여 
		 *  문자열을 처리해야 하는 상황에서 InputStreamReader 를사용
		 */

	public static void main(String[] args)throws IOException {
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		System.out.print("팩토리얼 숫자 입력");
		int n = Integer.parseInt(br.readLine());//입력한 문자열 반환 -> 정수형으로 형변환
		int result = factorial(n);
		System.out.println(result);
		br.close();
		}
		
//여기서 주의할 점은 readLine() 오류가 반환되는 문자열이 반드시 숫자 형태의 문자열이어야 한다
//"123"인 경우 Integer.parseInt() 방식은 이 문자열을 정수형으로 
//변환하여 기억에 저장합니다.  즉, n의 값은 123이 됩니다
	
	public static int factorial(int n) {
		if (n==1) {
			return 1;
		}
		else {
			return n * factorial(n-1);
		}
	}

}
