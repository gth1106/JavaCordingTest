import java.util.*;
public class 공넣기재풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		int arr[]=new int[N];
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=i+1;
//		}
		for(int i=0;i<M;i++) {
			int I=sc.nextInt()-1;
			int J=sc.nextInt()-1;
			int K=sc.nextInt();
			for(int j=I;j<=J;j++) {
				arr[j]=K;
				
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
