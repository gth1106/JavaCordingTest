import java.util.*;
import java.util.Arrays;
public class 최대최소_10818_다시풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] N=new int[sc.nextInt()];
		
		
		for(int i=0;i<N.length;i++) {
			N[i]=sc.nextInt();
			
			
	
		}
		Arrays.sort(N);
		System.out.println(Arrays.toString(N));
			
		System.out.println(N[0]+" "+N[N.length-1]);

		
		
	}

}
