package backjoon;
import java.util.*;
public class 재귀_문자열길이 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		String S[] = sc.next().split("");
		int cnt=0;
		for (int i=0;i<S.length;i++) {
			//ystem.out.println(S[i]);
			cnt++;
		}
		System.out.println(cnt);
}
	}
//	public class RecursiveStringLength {
//	    public static int getStringLength(String s) {
//	        if (s.equals("")) { // 기저 조건
//	            return 0;
//	        } 
//	        else {
//	            return 1 + getStringLength(s.substring(1)); // 첫 번째 문자를 잘라내고 재귀 호출
//	        }
//	        
//	    }
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String S = sc.next();
//        System.out.println(getStringLength(S));
//	}
//
//}
