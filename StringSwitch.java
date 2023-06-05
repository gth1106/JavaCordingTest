package JavaProgramming;

import java.util.Scanner;
public class StringSwitch {
	public static void main(String args[]){

	Scanner sc =new Scanner(System.in);
	int monthNumber;
	int month=sc.nextInt();
	int days=0;

	switch(month){
	case 1,3,5,7,8,10,12:
		days=31;
		break;
	case 4,6,9,11:
		days=30;
		break;
	
	case 2:
		days=28;
		break;
	}
	System.out.println(days);
	}
}
		
	