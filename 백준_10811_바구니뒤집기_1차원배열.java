import java.util.*;
public class 백준_10811_바구니뒤집기_1차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(); 
		int M=sc.nextInt();
		int []arr=new int[N];
		
		// 바구니의 순서를 역순으로
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		
		for(int i=0;i<M;i++) {
			int I=sc.nextInt()-1;
			int J=sc.nextInt()-1;
			
			int []tmp=new int[J-I+1];
			int plus=0;
			for(int j=J;j>=I;j--) {
				tmp[plus]=arr[j];
				plus++;
				arr[plus]=j;
			}
			
				/* 교환
				 * int temp;
				 * temp=x;
				 * x=y;
				 * y=temp;	*/
		}				
					
		
		for(int i=0;i<arr.length;i++) {	
			System.out.print(arr[i]+" ");
		}
	
	}

}
