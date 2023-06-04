package backjoon재풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 문자열아스키코드 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		
		
		System.out.println(S.compareTo("a")+97);
	}

}
