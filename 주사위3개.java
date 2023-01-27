import java.util.*;
public class 주사위3개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int A=sc.nextInt(); 
		int B=sc.nextInt(); 
		int C=sc.nextInt();
		//final int[] SIZE=new int[5];
		if(A!=B && B!=C && A!=C) {
			int max;
			
			if(A>B) {
				if(C>A) {
					max=C;
				}
				else
					max=A;
				}
			//B>A 일때
			else {
				if(C>B) //C>B>A
					max=C;
				else {
					max=B;
				
				}
			}
		System.out.println(max*100);	
		}
		
		else {
			if(A==B && A!=C)
				System.out.println(1000+A*100);
			else if(A==C && B!=C)
				System.out.println(1000+A*100);
			else if(B==C && A!=C)
				System.out.println(1000+B*100);
				if(A==B && A==C)
					System.out.println(10000+A*1000);
			
			
			
		}
		
		
		
	}

}
