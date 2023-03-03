import java.util.*;
public class 자바입문_변수와자료형_스위치문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int month = 12;
		int day;
		switch(month) {
		case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case  12 : day = 31;
		System.out.println(31);
		break;
		
		
		case 2 : day =28;
		System.out.println(28);
		break;
		
		case 4 : case  6 : case 9 : case 11 : day = 30;
		System.out.println(30);
		break;
		
		default :
			System.out.println("오류");
		
		}
		
		
	}

}
