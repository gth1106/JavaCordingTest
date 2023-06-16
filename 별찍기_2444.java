package 심화_백준;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class 별찍기_2444 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =Integer.parseInt(br.readLine());
		
	
			
			for(int i=1;i<=n;i++) {
				//System.out.print("*");
				for(int j=n;j>i;j--) {
					System.out.print(" ");
				}
				for(int j=0;j<i*2-1;j++) {
					System.out.print("*");
				}
			
				System.out.println();
			}
			for(int i=1;i<n;i++) {
				
				for(int j=0;j<i;j++) {
					System.out.print(" ");
				}
				for(int j=n*2-1;j>i*2;j--) {
					System.out.print("*");
				}
				System.out.println();
			}
		

	}

}
