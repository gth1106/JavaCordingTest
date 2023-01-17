import java.util.*;
public class date_2023_0114 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 첫째 줄에 총 금액 ( x+y+z )
		// 둘째 줄 구매한 물건의 개수
		//  가격 : a , 개수 b ( N 번째 줄)
		
		Scanner scan =new Scanner(System.in);
		int total=scan.nextInt();
		int count =scan.nextInt();
		
		for(int i=0; i<count;i++) {
			int price =scan.nextInt();
			int num =scan.nextInt();
			
			total=total - (price * num);
		}
		if(total==0)
			System.out.println("Yes");
		// Yes  total 0 이 되면 
		else if(total !=0)
			System.out.println("NO");
		
					
		

	}

}
