import java.util.Scanner;
public class 더하기사이클 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		
		int copy=N;
		int count=0;
		
		while(true) {
			N =(((N%10)*10)+((N/10)+(N%10))%10); // T 의 십의 자릿수
			count++;
			if(copy==N)
				break;
		}
		System.out.println(count);
	
	}

}
