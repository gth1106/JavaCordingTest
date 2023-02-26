import java.util.*;
import java.util.Arrays;
public class 알파벳찾기_10809_문자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int []arr=new int[26];
		String S=sc.next();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		for(int i=0;i<S.length();i++) {
			char ch = S.charAt(i);
			
			if(arr[ch - 'a']==-1) {
				arr[ch - 'a'] = i;
			}
			
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"");
		}
		
		
		
	}

}
