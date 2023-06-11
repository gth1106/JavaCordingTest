package backjoon재풀이;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
public class 문자와문자열 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int index = Integer.parseInt(br.readLine())-1;
		System.out.println(S.substring(index,index+1));
//		br.read()는 BufferedReader에서 문자 하나를 읽어서 
//		해당 문자의 아스키 코드 값을 반환하는 메서드입니다. 반환되는 값은 int 형입니다.
//      그러나 원하시는 것은 문자열로 입력받은 값을 정수로 변환하는 것이므로, 
//		Integer.parseInt()를 사용하여 문자열을 정수로 변환해야 합니다.
	}

}
