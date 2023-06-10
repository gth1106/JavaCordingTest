package backjoon재풀이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.StreamTokenizer;
public class 문자열_9086 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Size =Integer.parseInt(br.readLine());
		
		for(int i=0 ; i<Size;i++) {
			String S=br.readLine();
			System.out.print(S.charAt(0));
			System.out.print(S.charAt(S.length()-1));
			System.out.println();
			
		}
		
		
	}

}
