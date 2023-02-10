import java.util.*;

public class 최소최대값_10818 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		int []N=new int[sc.nextInt()];
		int max=0;
		int min=0;
		for(int i=0;i<N.length;i++) {
			N[i]=sc.nextInt();
			if(N[i]>=max) {
				max=N[i];
			}
			else if(N[i]<=min) {
				min=N[i];
			}
				
			}
	
		System.out.println(max+" "+min);
		
			
			
		
		
	}
}
