package workspace;
import java.util.*;
public class 수업돌발퀴즈_0418 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//3명의 학생의 점수를 입력받아 평균과 각 학생의 점수를 출력하시오
		Scanner sc = new Scanner(System.in);
//		int s1=sc.nextInt();
//		int s2=sc.nextInt();
//		int s3=sc.nextInt();
//		int sum=s1+s2+s3;
//		double avg= (s1+s2+s3)/3;
//		System.out.println("평균= "+avg);
		
		int size=sc.nextInt();
		int student[]=new int[size];
		for(int i=0;i<size;i++) {
			student[i]=sc.nextInt();
		}
		double avg2=0;
		for(int i=0;i<size;i++) {
			 avg2 = avg2+student[i]/size;
		}
		System.out.println(avg2);
		for(int i=0;i<student.length;i++) {
			System.out.println((i+1+". "+student[i]));
		}
		
	}

}
