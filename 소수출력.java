package JavaProgramming;
import java.util.*;
public class 소수출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 순차구조
		// if 선택구조
		// for ,while 반복구조
		Scanner sc = new Scanner(System.in);
		int Size =sc.nextInt();
		for(int i=2;i<=Size;i++) {
			int temp=1;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					temp=0;
					break;
				}
		
			}
			if(temp==1) 
				System.out.print(i+" ");
		}
	}

}
