import java.util.Scanner;
public class 백준_바구니뒤집기_10811 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int Size=sc.nextInt();
		int N[]=new int[Size];
		int M=sc.nextInt();
		
		for(int i=1;i<=Size;i++) {
			N[i-1]=i;
		}
		
		for(int i=0;i<M;i++) {
			
			int I=sc.nextInt()-1;
			int J=sc.nextInt()-1;
			int temp[] = new int[J-I+1];
			int plus=0;
			
			for(int j=J;j>I;j--) {
				
				temp[plus]=N[j];
				
				plus++;
				N[plus]=N[j];
			
		}
		}
		for(int i=0;i<N.length;i++)
			System.out.println(N[i]);
	}

}
