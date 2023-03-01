import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class 빠른연산_BufferedReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BuffeReder br = new BuffeReder(new InputStreamReader(System.in));
		// String 뱐수 = br.readLine();
		// int i = integer.parseInt(br.readLine()); 형변환
		
		// 예외 처리하기
		/*
		 *  readLine 을 할때마다 try & catch 를 활용하여 예외처리를 해주는 방법
		 *  IOException 을 사용하는 방법
		 *  throw 사용시 클래스 import 해주고
		 *  1.import java.IOException;
		 *  2. main 클래스 옆에 throws IOException 을 작성
		 *  Read 한 데이터는 Line 단위로만 나눠지기에 공백단위로 데이터를 가공하려면 따로 작업해야한다.
		 *  
		 *  1. StringTokenizer 에 nextToken() 함수를 쓰면 readLine () 을 통해 입력받은 값을 
		 *  공백단위로 구분하여 순서대로 호출 할 수 있다.
		 *  2. String.split() 함수를 활용하여 배열에 공백단위로 끊어서 데이터를 넣고 사용하는 방식이다.
		 *  
		 *  BufferedWriter 의 경우 버퍼를 잡아 놓았기 때문에
		 *  flush() , close () 를 반드시 호출 해야한다.
		 *  
		 *  bw.write 에는 System.out.println(); 과 같이 자동 개행능력이 있어서 
		 *  "\n" 을 통해 따로처리
		 *  
		 *  bw.write(S+"\n"); 버퍼에 있는 값 전부 출력
		 *  bw.flush(); 남아있는 데이터를 모두 출력시킴
		 *  bw.close(); 스트림을 닫음
		
		 */
	}

}
