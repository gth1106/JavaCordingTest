package workspace;
import java.util.*;
public class 퀴즈2_0418 {

	public static void main(String[] args) {
		// 1에서 100까지의 숫자를 배열에 ㅈ장하고
		// 각 숫자를 더할때 까지의 더한 숫자를 출력하시오
		Scanner sc =new Scanner(System.in);
		int []arr=new int[100];
		int sum=0;
			for(int i=0;i<100;i++) {
				arr[i]=i+1;		
			}
			for(int i=0;i<100;i++) {
				sum=sum+arr[i];
				
				for(int j=0;j<arr[i];j++) {
				System.out.print(arr[j]+" ");
				
				
				}
				System.out.print("= "+sum);
				System.out.println();
			}
			System.out.println();
			System.out.println(sum);
		
	}

}
