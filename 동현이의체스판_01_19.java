import java.util.*;
public class 동현이의체스판_01_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//킹1 퀸1 룩2 비숍2 나이트2 폰8
		Scanner sc =new Scanner(System.in);
		int c[]=new int[6];
		for(int i=0;i<6;i++) {
			c[i]=sc.nextInt();
		}
		
		int a[]= {1,1,2,2,2,8};
		for(int k=0;k<6;k++) {
			
			System.out.print(a[k]-c[k]+" ");
		}
		
	}

}
