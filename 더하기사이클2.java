import java.util.*;
public class 더하기사이클2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int x=n;
		int count=0;
		
		while(true) {
			int left=x/10;
			int right=x%10;
			x=(right*10)+(left+right)%10;
			count++;
			if(n==x)
				break;
		}
		System.out.println(count);
	}

}
