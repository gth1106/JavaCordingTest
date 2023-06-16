package classpart;

public class 비트연산자_0321 {

		public static void main(String[] args) {
		 
		int x=0x0fff;
		System.out.printf("%d\n", (-1>>4));
		System.out.printf("%d\n", (-1>>>4)); 
		System.out.print (32>>>4); 
		/*
		 *  -1    이진수로 표현 32bit
		 *   1 = 0000 0000 0000 0001
		 *  -1 = 1111 1111 1111 1111
		 *  
		 *  -1 >> 4  == -1
		 *   비트 이동을해도 부호비트를 유지하여 계속 1을 채운다.
		 *   
		 *   -1 >>> 4 부호비트 유지 X
		 *   
		 *   0000 1111 1111 1111
		 *   16진수 : 0fff
		 *   
		 */
		}
	}