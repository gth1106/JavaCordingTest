package backjoon재풀이;
import java.io.*;
public class 문자열반복하기 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int Size = Integer.parseInt(br.readLine());
		
		
		
		for(int i=0;i<Size;i++) {
			String arr[]=br.readLine().split(" ");
			int R = Integer.parseInt(arr[0]);
			String st = arr[1];
			
			int temp=0;
			for(int j=0;j<st.length();j++) {
				for(int k=0;k<R;k++) {
					System.out.print(st.charAt(temp));
				}
				temp++;
			}
			System.out.println();
		}
		
	}

}
