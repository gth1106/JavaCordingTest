package workspace;
import java.util.*;
public class 중첩반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(j%2!=0) {
					sum=sum+1;
				}
			}
			
		}
		System.out.println(sum);
	}

}
