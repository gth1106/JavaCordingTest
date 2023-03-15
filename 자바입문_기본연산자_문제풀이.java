import java.util.*;
public class 자바입문_기본연산자_문제풀이 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
        // 1. 짝수단만 출력
		
//		for(int i=2;i<=9;i++) {
//			if(i%2!=0)
//				continue;
//			for(int j=1;j<=9;j++) {
//				
//				System.out.println(i+"x"+j+"="+i*j);
//			}
//		} 정답 !!
		
		// 2. 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 만들자.
//		for(int i=2;i<=9;i++) {
//			for(int j=1;j<=9;j++) {
//				if(i<j)
//					break;
//				System.out.println(i+"x"+j+"="+i*j);
//			}
//		} 정답 !!
		
		// 3. 별찍기 + 4 번 별찍기
		for(int i=1;i<5;i++) {
			for(int j=4;j>i;j--) {
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print(" ");
			}
			for(int j=5;j>2*i;j--) {
				System.out.print("*");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
