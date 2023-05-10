package workspace;

public class sadasdasw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int i, j, n;
	      n = 9;
	      char [][] arr = new char[n][n];
	      
	      for(i=0; i<n; i++) {
	         for(j=0; j<n-1; j++) {
	            arr[i][j] = '#';
	         }
	         for(j=0; j<i; j++) {
	            arr[i][j] = '*';
	         }
	         for(j=0; j<i; j++) {
	            arr[i][j] = '9';
	         }
	      }
	      for(i=0; i<n; i++) {
	         System.out.printf("%2d:", i);
	         for(j=0; j<n; j++) {
	            System.out.print(arr[i][j]);
	         }
	         System.out.print("\n");
	      }
	      System.out.print(arr[n/2][3]);
	      System.out.print(arr[n-1][3]);
	   }

	
	}


