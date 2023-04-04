package backjoon;
import java.util.Scanner;
public class 문자열_1번 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		String S = sc.next();
		int k=sc.nextInt();
		System.out.println(S.substring(k-1,k));
				
	}

}
