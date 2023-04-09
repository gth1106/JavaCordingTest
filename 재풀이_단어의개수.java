package backjoon;
import java.util.*;
public class 재풀이_단어의개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S=sc.nextLine();
		int cnt=0;
		for(int i=0;i<S.length();i++) {
			if(S.charAt(i)==' ') {
				cnt++;
			}
		}
		if (S.charAt(0)==' ' && S.charAt(S.length()-1)==' ') {
			cnt=cnt-1;
		}
		if (S.charAt(0)!=' '&& S.charAt(S.length()-1)!=' ') {
			cnt=cnt+1;
		}
		System.out.println(cnt);
		
	}

}
