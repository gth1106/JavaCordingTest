package workspace;
import java.util.*;
public class ASASAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//다음 프로그램에서 아래와 같이 키보드로 입력하였다고 가정할 경우 프로그램의 실행결과를 답안에 직접 작성하시오. 
		//import java.util.Scanner;

		
		  Scanner s = new Scanner(System.in);
		  byte a, b, c;
		  a = (byte) s.nextInt();
		  b = (byte) s.nextInt();
		  c = (byte) s.nextInt();
		  if (c > 4) {
		   System.out.print("A");
		  } else {
		   if (b > 2) {
		    if (a > 2) {
		     System.out.print("B");
		    } else {
		     System.out.print("C");
		    }
		    System.out.print("D");
		   } else {
		    System.out.print("E");
		   }
		   System.out.print("F");
		  }

		  return;
		 }
	
		}
		//키보드 입력내용
		//3 2 3    

