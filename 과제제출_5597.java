import java.util.*;
public class 과제제출_5597 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr =new int[31];
		Scanner  sc = new Scanner(System.in);
		
		for(int i=1;i<29;i++) {
			int student=sc.nextInt();
			arr[student]=1;
			
			
		}
		for(int i=1;i<arr.length;i++) {
			if(arr[i]!=1)
				System.out.println(i);
		}
	}

}
