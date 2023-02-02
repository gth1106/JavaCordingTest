import java.util.*;
public class 별찍기연습1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		
		for(int i=0;i<a;i++) {
			for(int j=0;j<a;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
