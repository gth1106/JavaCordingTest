import java.util.*;
public class 오븐시계2 {

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
		
		
	// if 문을 써서 하고싶은데 도저히 생각이 나지 않는다.
	 // 내일도 박치기 안되면 될때까지
		
	}

}
