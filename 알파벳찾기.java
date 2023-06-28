package backjoon재풀이;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 알파벳찾기 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[26] ;
		String st =br.readLine();
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=-1;
		}
		for(int i=0;i<st.length();i++) {
			char ch = st.charAt(i);
			if (arr[ch-'a']== -1 ) {
				arr[ch-'a']=i;
			}
		
		}
		for(int a : arr) {
			System.out.print(a+" ");
		}
	}

}
