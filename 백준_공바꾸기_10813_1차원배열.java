import java.util.*;
public class 백준_공바꾸기_10813_1차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int []N = new int[sc.nextInt()]; // 바구니의 개수 5/ 0 1 2 3 4
		int M=sc.nextInt(); // 4번 공을 던져 둘쨰줄부터표시
		for(int i=0;i<N.length;i++) { // 공의 번호 1 2 3 4 5
			N[i]=i+1;
			
		}
		
		for(int i=0;i<M;i++) { // 4번반복 
			int I=sc.nextInt(); // I 번 바구니 1 
			int J=sc.nextInt(); // J 번 바구니 2	
			
			int x;
			x=N[I-1];
			N[I-1]=N[J-1];
			N[J-1]=x;
			
			
			
		}
		
			
		
		for(int i=0;i<N.length;i++)
			System.out.print(N[i]+" ");
		
	}

}
