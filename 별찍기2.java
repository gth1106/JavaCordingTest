import java.util.*;
public class 별찍기2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		
		for(int i=0;i<a;i++) {			
			for(int j=1;j<a-i;j++) {
				System.out.print(" ");
			}
		
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		  }
	}
}


