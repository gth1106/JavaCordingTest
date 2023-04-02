
import java.util.*;
public class 재성공_과제안내신분_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[31]; // 30 명
		
		
		for(int i=1;i<29;i++) {  // 28 명 출석
			arr[sc.nextInt()]=1;
			}
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]!=1) {
				System.out.println(i);
				
			}
			
			
		}
	}

}
