import java.util.*;
public class 일부터엔까지의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			int SIZE; int n=0; int sum=0;
			SIZE=sc.nextInt();
			for(int i=0;i<SIZE;i++) {
				 n=n+1;  //i=0 -> n=1 , i=1 n=2 i=2  n=3
				 sum=sum+n;
				 
				 
			}
			System.out.println(sum);
			
	}

}
