package backjoon;

import java.util.Scanner;

public class 알파벳찾기_10809 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int[] arr = new int[26];
//26 a~z	
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);

			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}

		}
		for(int var: arr) {
			System.err.print(var+" ");
		}

		/*
		 * 그다음, 입력받은 문자열 길이만큼 반복하여서 
		 * 문자 처음부터 끝까지 charAt(i)으로 i를 arr의 알파벳 순서에 값으로 집어넣도록 한다. 
			arr[ch]가 아니라 arr[ch-'a']인 이유는 
			arr의 index는 a~z 순서이기 때문이다. 
			아스키코드의 10진수에 따라 각 문자에 할당된 번호대로
			 a~z가 순서대로 위치해 있기에 알파벳에서 
			 'a'를 빼면 몇 번째에 있는 알파벳인지를 알수가 있는 것이다.
		 */
		//System.out.print("b".compareTo("a"));
	
	
	}

}

