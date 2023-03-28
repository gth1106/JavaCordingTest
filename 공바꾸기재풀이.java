import java.util.*;
public class 공바꾸기재풀이 {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		int i;
		
		int arr[]=new int[N];
		for( i=0;i<arr.length;i++) {
			arr[i]=i+1;
		}
		for( i=0;i<M;i++) {
			
			int I=sc.nextInt()-1;
			int J=sc.nextInt()-1;
			int temp[]=new int[N];
			temp[J]=arr[I];
			arr[I]=arr[J];
			arr[J]=temp[J];
			
			
			
			
		}
		for(i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}
