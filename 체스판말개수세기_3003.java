package 재귀;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class 체스판말개수세기_3003 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		String input[]=br.readLine().split(" ");
		int arr[]=new int[input.length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=Integer.parseInt(input[i]);
		}
		int chess[]= {1,1,2,2,2,8};
		for(int i=0;i<arr.length;i++) {
			System.out.print(chess[i]-arr[i]+" ");
			
		}
		
	}

}
