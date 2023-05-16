package workspace;

public class texexts1 {

	// public static void main(String[] args) {
	// TODO Auto-generated method stub
	// 다음 프로그램의 실행결과를 답안에 적으시오.
//		
//		 public static void main(String[] args) {
//		  int i, j, n;
//		  n = 9;
//		  // 이차원 배열 생성
//		  char[][] arr = new char[n][n];
//		  // 값 입력
//		  for (i = 0; i<n; i++) {
//		   for (j = 0;j<n;  j++) {
//		    arr[i][j] = '#';
//		    
//		   }
//		   
//		   for (j = 0; j < n - i; j++) {
//		    arr[i][j] = '*';
//		    System.out.print(arr[i][j]);
//		   }
//		  System.out.println();
//		  }
//		  // 출력
//		//  for (i = 0; i &lt; n; i++) {
//		//   System.out.printf("%2d: ", i);
//		//   for (j = 0; j &lt; n; j++) {
////		    System.out.print(arr[i][j]);
//		//   }
//		//   System.out.print("\n");
//		//  }
//		  
//		  System.out.print(arr[n/2][3]);
//		  System.out.print(arr[n-1][3]);
	// return;

//public class WebDatabase {
	public static void main(String[] args) {
		int inputA = 6;
		int inputB = 7;
		int n = 6;
		int sum = 0;
		int i, j;

		for (i = 0; i < n; i++) {

			for (j = 0; j < n - i; j++) {
				System.out.print("*");
			}

			for (j = 0; j < 1; j++) {
				System.out.print(" ");
			}

			for (j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

	}
}
