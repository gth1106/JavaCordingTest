package workspace;

public class aaxaxaxa {

	public static void main(String[] args) {
	      int i, j, n;
	      n = 9;
	      int [][] arr = new int[n][n];
	      
	      for(i=0; i<n; i++) {
	         for(j=0; j<n-i;j++) {
	            arr[i][j] = 1;
	         }
	         for(j=0; j<1; j++) {
	            arr[i][j] = 2;
	         }
	         for(j=0; j<i; j++) {
	            arr[i][j] = 3;
	         }
	      }
	      for(i=0; i<n; i++) {
	         System.out.printf("%2d:",i);
	         for(j=0;j<n;j++) {
	            System.out.printf("%2d",arr[i][j]);
	         }
	         System.out.print("\n");
	      }
	      System.out.print(arr[n/2][3]);
	      System.out.print(arr[n-5][3]);
	   }

	}