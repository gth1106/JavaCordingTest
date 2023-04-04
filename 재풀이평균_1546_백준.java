import java.util.*;
import java.util.Arrays;
public class 재풀이평균_1546_백준 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double arr[]= new double[sc.nextInt()];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
//		Arrays.sort(arr);
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(arr[i]);
//		}
		double sum=0;
		
		for(int i=0;i<arr.length;i++) {
			double avg = (arr[i]/(arr[arr.length-1]))*100;
			sum=sum+avg;
		}
		System.out.println(sum/arr.length);
		
		

	}

}
