package backjoon재풀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 단어길이재기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		String S =br.readLine();
		int cnt = 0;
		for(int i=0;i<S.length();i++) {
			cnt +=1;
		}
		System.out.println(cnt);

	}


}
