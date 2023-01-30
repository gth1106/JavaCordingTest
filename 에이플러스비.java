import java.util.Scanner;
public class 에이플러스비 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int Size=sc.nextInt();
		for(int i=1;i<=Size;i++) {
			int A=sc.nextInt();
			int B=sc.nextInt();
			System.out.println("Case #"+i+": "+(A+B));
		}
		
	}

}
