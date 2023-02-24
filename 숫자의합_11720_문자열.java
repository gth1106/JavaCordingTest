import java.util.Scanner;

public class 숫자의합_11720_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int sum=0;
		String num=sc.next()
				;
		for(int i=0;i<N;i++) {
			
			sum+=num.charAt(i)-48; //charAt() 해당문자의 아스키코드값을 반환하므로 -48EHsms -'0' 을해야함
			
			
					
		}
		System.out.println(sum);
		
		
		
	}

}
