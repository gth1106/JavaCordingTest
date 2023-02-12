import java.util.*;

public class 최댓값_2562 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		int [] arr = new int[9];
		int cnt=0;
		int max=-9999;
		
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
				cnt=i+1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
		
	}

}
