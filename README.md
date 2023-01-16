# JavaCordingTest
import java.util.*;
public class 알람시계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int H;int m;
		int M;int h;
		Scanner scan= new Scanner(System.in);		
		H=scan.nextInt();
		M=scan.nextInt();
		
		if(H>=0 && H<=23 && M>=0 && M<=59 ) {
			m=M-45;
			H--;
			
			if(H>=0 && m>=0) {
				H++;
				System.out.println(H+" "+m);
			}
			else if(H>=0 && m<0) {
				M=m+60;
				System.out.println(H+" "+M);
			}
			else if(H<0 && m>=0) {
				H++;
				System.out.println(H+" "+m);
			}
			else if(H<0 && m <0) {
				M=m+60;
				
				h=(H+24);
				System.out.println(h+" "+ M);
			}
			
			
		}
}
}		
				
				

				
