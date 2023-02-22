import java.util.*;
public class 문자열_9086_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int testsize;
		
		testsize=sc.nextInt();
		for(int i=0; i<testsize;i++) {
			String str=sc.next();
			System.out.print(str.charAt(0));
			System.out.print(str.charAt(str.length()-1));
			System.out.println();
		}
	}

}
