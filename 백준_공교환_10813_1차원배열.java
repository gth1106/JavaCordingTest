import java.util.*;
public class 백준_공교환_10813_1차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []N = new int[sc.nextInt()];
		int M=sc.nextInt();
		
		for(int i=0;i<M;i++) {
			int I=sc.nextInt();
			int J=sc.nextInt();
			for(int j=I-1;j<J;j++) {
				N[j]=J;
				N[j]=I;
			}
			
		}
		for(int i=0;i<N.length;i++)
		System.out.println(N[i]+ " ");
		
	}

}
