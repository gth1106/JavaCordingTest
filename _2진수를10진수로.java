package backjoon;

import java.util.*;

public class _2진수를10진수로 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String binary = sc.next();

		int p = 1;
		int sum = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			String str = binary.substring(i - 1, i);

			sum = sum + (p * Integer.parseInt(str));
			p = p * 2;

		}
		System.out.println(sum);
	}

}
