import java.util.*;

public class 평균은넘겠지_4344_2차시도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int testcase=sc.nextInt(); // 행개수
		int []arr;					// 배열 선언
		for(int i=0;i<testcase;i++) { 
			int N=sc.nextInt();
			arr=new int[N]; // 배열크기 선언
			
			double sum=0; //성적합계
			
			for(int j=0;j<N;j++) {
				int student=sc.nextInt();
				arr[j]=student;
				
				sum+=arr[j];
				
			}
			double avg=(sum/N); //평균값
			double cnt=0;  //평균을넘는사람들
			
			for(int j=0;j<N;j++) {
				if(arr[j]>avg) {
					cnt++;
				}
			}
		
		System.out.printf("%.3f%%\n",(cnt/N)*100);
			
			
		}
		

	}

}
