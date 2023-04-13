package workspace;
import java.util.*;
public class _0413_별찍기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++) {
			System.out.print(i+" ");
			for(int j=0;j<n-i;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		for(int i=0;i<n;i++) {
			System.out.print(i+n+" ");
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			
			for(int j=0;j<n-i;j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
	}

}
