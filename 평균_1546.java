import java.util.*;
import java.util.Arrays;
public class 평균_1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double []arr=new double[sc.nextInt()];
		
		double sum=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextDouble();
		}
		sc.close();
		Arrays.sort(arr);
		//System.out.println(Arrays.toString(arr)); // 오름차순 확인
		  //최댓값 찾기
		//System.out.println(max);
		//System.out.println(arr.length);
		
		for(int i=0;i<arr.length;i++) { // double 연산시 nextInt (X) -> nextDouble(); 
			double a=(arr[i]/arr[arr.length-1])*100;   //10^-2  이하의 오차허용 != 소수2번째 자리까지 출력하라는뜻이아니다.
			sum=sum+a;
			
		}
		double avg=sum/arr.length;
		System.out.println(avg);
		
		
	}

}
