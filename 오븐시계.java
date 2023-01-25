import java.util.*;
public class 오븐시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int A =sc.nextInt();
		int B=sc.nextInt();
		int C=sc.nextInt();
		int min =A*60+B;
		min=min+C;
		
		
	 int hour =(min/60)%24;
	 int minute =min %60;
	 System.out.println(hour+" "+minute);
		
		
	
		
	}

}
