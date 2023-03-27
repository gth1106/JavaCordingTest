package JavaProgramming;
import java.util.Scanner;
public class Switch_0327 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 3 0 1 2 BA
		
		// 2. 둘없음둘하나 - > 많음
//		int num;
//		Scanner sc = new Scanner(System.in);
//		num = sc.nextInt();
//		switch(num) {
//		case 0:
//			System.out.println("없");
//			break;
//		case 1:
//			System.out.println("하");
//			break;
//		case 2:
//			System.out.println("둘");
//			break;
//		default:
//			System.out.println("많음");
//			break;
//		}
		
		// 3.  38
		
//		int x=14;
//		int y=5;
//		if((x==3)&&(y==7)) {
//			System.out.printf("%x\n",(x>>2));	
//		}
//		else {
//			System.out.printf("%x\n",(x<<2));
//		}
		
		//4. AD
		
		//5. A
		
		//6. 했
		
		//7. 0 
//		int x1 =0x1;
//		int y1 =0x2;
//		System.out.printf("%x",(x1&y1));
//		System.out.printf("%x",(x1|y1));
		
		//8. 2
		//9. 3
//		String month ="march";
//		int monthNumber=0;
//		switch(month) {
//		case "january" :
//			monthNumber +=1;
//			break;
//		case "februay" :
//			monthNumber +=2;
//			break;
//		case "march" :
//			monthNumber +=3;
//			break;
//		default:
//			monthNumber +=10;
//			break;
//		}
//		System.out.println(monthNumber);
		
	
//		String m1 ="februay";
//		int monthNumber1;
//		switch(m1) {
//		case "january" :
//			monthNumber1 =1;
//			break;
//		case "februay" :
//			monthNumber1 =2;
//			break;
//		case "march" :
//			monthNumber1 =3;
//			break;
//		default:
//			monthNumber1 =0;
//			break;
//		}
//		System.out.println(monthNumber1);
//	
		//10. 10 2 3 ACD
		//11. fffffffa O
//		int y=5;
//		System.out.printf("%x",~y);
		// 12. 28 O
//		int month;
//		int year=2019;
//		int days=0;
//		Scanner sc =new Scanner(System.in);
//		month = sc.nextInt();
//		switch(month) {
//		case 1:
//		case 3:
//		case 5:
//		case 7:
//		case 8:
//		case 10:
//		case 12:
//			days =31;
//			break;
//		case 4,6,9,11:
//			days = 30;
//			break;
//		case 2:
//			if(((year%4==0)&&(year%100!=0))||(year%400==0))
//				days=29;
//			else
//				days=28;
//			break;
//			default:
//				System.out.println("-1");
//				break;
//			}
//			System.out.println(days);
		//13. 2019+28 = 2047
	// 14. BD
		//15.  17
//		String month = "february";
//		int monthNumber = 0;
//		switch(month) {
//		case "january":
//			monthNumber=1;
//		case "february":
//			monthNumber=2;
//		case "march":
//			monthNumber=3;
//		default:
//			monthNumber=0;
////			
//		}
//		System.out.println(monthNumber);
 		// 16.  하나둘
		// 17. 31
		//18. 0
		//21. 4
		int x=1;
		int y=1;
		int nx=++x;
		int ny=y++;
		nx=x++/++y;
		ny=y++;
		x=nx++*ny;
		if(x>y) {
			System.out.println(x);
		}
		else {
			System.out.println(y);
		}
		
	}

}
		
