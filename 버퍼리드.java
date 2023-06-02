package 재귀;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 버퍼리드 {

	public static void main(String[] args)throws IOException {
		/* StringTokenizer 클래스는 문자열을 표준 구분자(delimiter)를 
		 * 기준으로 분리하는 데 사용되는 클래스입니다. 팔찌를 분리할 때 
		 * 완전히 사용하는 경우는 nextToken() 경우입니다. 이 방법은 
		 * 다음과 같은 방법으로 사용됩니다.
		 *
		 *
		 */
		
		String str = "Hello, world! My name is ChatGPT.";
		StringTokenizer tokenizer = new StringTokenizer(str, " ,!.");
		while (tokenizer.hasMoreTokens()) {
		    String token = tokenizer.nextToken();
		    System.out.println(token);
		}
		
		/*
		 * BufferedReader, BufferedWriter, StringTokenizer는
		 *  레이저에서 찢을 때 사용하는 클래스입니다.

BufferedReader 클래스는 문자 입력 스트림에서 문자를 읽는 클래스입니다.
 버퍼링을 사용하여 입력 속도를 개선하고 특정 문자나 문자열로 구분된 데이터를 읽을 수 있습니다.

BufferedWriter 클래스는 문자 스트림으로 문자를 쓰는 클래스입니다. 
마찬가지로 버퍼링을 사용하여 속도를 개선하면 특정 문자나 문자열로 구분된 데이터를 쓸 수 있습니다.

StringTokenizer 클래스는 문자열을 표준 구분자 기준으로 분리하는 데 사용됩니다.
 주로 입력된 텍스트를 파싱하는 데 사용됩니다. 
 예를 들어, CSV 파일을 처리하거나 프로그램 인수를 분해하는 데 사용됩니다.

이러한 클래스는 작업을 수행할 때 자주 사용되며 Java 표준에서 여러 번으로 제공됩니다.
		 */
		

		

		 
		   
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		 System.out.print("출력할 구구단의 단 수를 입력하세요: ");
		 int dan = Integer.parseInt(reader.readLine());

		 System.out.println(dan + "단 출력");
		 for (int i = 1; i <= 9; i++) {
		            System.out.println(dan + " x " + i + " = " + (dan * i));
		        }
		   
		


	}

}
