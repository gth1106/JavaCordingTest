import java.util.*;

public class 재풀이_공뒤집기_백준 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int arr[] = new int[N];
		int M = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = 0; i < M; i++) {
			int I = sc.nextInt() - 1;
			int J = sc.nextInt() - 1;

			int[] temp = new int[J - I + 1];
			int k = 0;
			for (int j = J; j >= I; j--) {
				temp[k] = arr[j];
				k++;
			}
			k = I;
			for (int j : temp) {
				arr[k] = j;
				k++;
			}

		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
