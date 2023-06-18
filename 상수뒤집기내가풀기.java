package backjoon재풀이;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 상수뒤집기내가풀기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String []arr = br.readLine().split(" ");
		String c1 = reverseString(arr[0]);
		String c2 = reverseString(arr[1]);
		System.out.println(Math.max(Integer.parseInt(c1),Integer.parseInt(c2)));
	
	}
	public static String reverseString(String str) {
		char []arr = str.toCharArray();
		int left =0;
		int right =arr.length-1;
		
		while(left<right) {
			char temp = arr[left];
			arr[left]=arr[right];
			arr[right]=temp;
			left++;
			right--;
		}
		return new String(arr);
	}

}
