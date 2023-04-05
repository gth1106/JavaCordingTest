package backjoon;
import java.util.*;
public class 문자열반복_2675_백준 {

	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();	
		for(int i=0;i<T;i++) {
			int R=sc.nextInt();	
			String S=sc.next();
			System.out.println();
			for(int j=0;j<S.length();j++) {							
				
				for(int k=0;k<R;k++) {
					System.out.print(S.charAt(j));
				}
							
			}
			
			
		}
		
	}

}
