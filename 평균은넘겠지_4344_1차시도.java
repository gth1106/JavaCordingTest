import java.util.*;

public class 평균은넘겠지_4344_1차시도 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		// 알고리즘 찾기 1. 인원선정
//		int []arr=new int[sc.nextInt()];
//		for(int i=0;i<arr.length;i++) {
//			int sum=0;
//			int cnt=sc.nextInt();
//			arr[i]=sc.nextInt();
//			for(int j=0;j<arr[i].length();j++) {
//				sum=sum+arr[i]
//		}
//			}
		int arr[];
		int testcase=sc.nextInt(); //행 개수
		for(int i=0;i<testcase;i++) {
			int N=sc.nextInt(); //학생수
			
			double sum=0; // 성적 합 (각행마다 합계를 출력하기위해 for문안에삽입)
			
			for(int j=0;j<N;j++) {
				int X=sc.nextInt(); // 성적입력
				arr[j]=X;
				sum+=X;      //성적 누적합
			}
			// 평균을 넘는 학생들을 산출..
		}
	}

}
