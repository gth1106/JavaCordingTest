package JavaProgramming;
import java.util.*;
public class if문활용입력출력 {
		public static void main(String args[]){
		
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num<3){
			if(num==2){
				System.out.println("둘");
			}
			if(num==1){
				System.out.println("하나");
					}
			if(num==0){
				System.out.println("없음");
			}
			
				
		}
		else {
			System.out.println("많음");
		}	
		}
	}