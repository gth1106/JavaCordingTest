package backjoon;
import java.io.*;
public class 팰린드롬 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		if(reverseString(input)==true) {
			System.out.println(1);
		}
		else if(reverseString(input)==false) {
			System.out.println(0);
		}
		
	}


	public static  boolean reverseString(String str) {
		boolean a = true;
		char arr[]=str.toCharArray();
		
		int left=0;
		int right = str.length()-1;
		
		while(left<=right) {
			if(arr[left]==arr[right]) {
				a=true;
			}
			else {
				a=false;
			}
			left++;
			right--;
		}
				
		
		
		
		return  a;
		
	}
	
}