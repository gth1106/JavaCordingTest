package workspace;

import java.util.*;

public class _0330_1에서10까지의합_반복문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 값을 저장할 변수 1~10 합계 저장 변수 =sum
		 */
		int i = 0; // loop varible
		int sum = 0;

		while (i < 100) {
			i++;
			sum = sum + i;
		}
		System.out.println(sum);

	}

}
