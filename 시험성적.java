import java.util.*;
public class 시험성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int score=sc.nextInt();
		
		if(score>=90)
			System.out.println("A");
		else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("C");
		else if(score>=60)
			System.out.println("D");
		else
			System.out.println("F");
		
		
	}

}
