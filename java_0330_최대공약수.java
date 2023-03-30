package workspace;
import java.util.*;
public class java_0330_최대공약수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,r=1,a,b;
		Scanner sc = new Scanner(System.in);
		
		a=sc.nextInt();
		b=sc.nextInt();
	    
	        if(a>b){//2번째 입력수가 클 경우 큰수를 val1으로 변경
	            x = a;
	            y = b;
	         }
	        else {
	        	x=b;
	        	y=a;
	        }
	 
	         while(r>0){//유클리드 호제법을 이용한 GCD(최대공약수)구하기
	             r = x % y;
	             x = y;
	             y = r;
	          }
		System.out.println(x);
	}

}
