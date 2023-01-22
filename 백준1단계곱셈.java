import java.util.*;
public class 백준1단계곱셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		// % / 
		int A=sc.nextInt();
		int B=sc.nextInt();
		
		System.out.println(A*(B%10));
		System.out.println(A* ((B%100)/10));
		System.out.println(A*(B/100));
		System.out.println(A*B);
		
		
			
			
		
	}

}
