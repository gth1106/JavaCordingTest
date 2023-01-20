import java.util.Scanner;
public class 구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println();
		for(int i=1;i<=9;i++) 
			System.out.println(N+" * "+i+" = "+N*i);
	}

}
