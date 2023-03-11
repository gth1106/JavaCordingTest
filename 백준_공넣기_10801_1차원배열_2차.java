import java.util.*;
public class 백준_공넣기_10801_1차원배열_2차 {

	public static void main(String[] args) {
		
		/*
		 *  1. 바구니의 개수 N , 1~N
		 *  2. M번 공을 넣는다.
		 *  첫째줄 N,M
		 * 바구니에 공이 미이 있는경우 -> 들어있는 공블 뺴고 , 새로 공을 넣는다.
		 * 공을 넣을 바구니는 연속되어 있어야한다.
		 */
		Scanner sc = new Scanner(System.in);
		int S=sc.nextInt();
		int M=sc.nextInt();
		int	[]N=new int[S];
		
		for(int i=0;i<M;i++) {
			int I=sc.nextInt();
			int J=sc.nextInt();
			int K=sc.nextInt();
			
			
			for(int j=I-1;j<J;j++) {
				N[j]=K;
			}
		}
		for(int i=0;i<N.length;i++) {
			System.out.print(N[i]+" ");
		}
		
		
		
	}

}
