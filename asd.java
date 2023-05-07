package workspace;

public class asd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  int n = 6;
		  int sum = 0;
		  int i, j;

		  for (i = 0; i < n; i++) {

		   for (j = 0; j < n - i; j++) {
//		    System.out.print(" ");
		   }

		   for (j = 0; j < i; j++) {
		    sum = sum + 1;
		   }

		   for (j = 0; j < i; j++) {
		    sum = sum + 1;
		   }
		  }
		  System.out.print(sum);
		

	}

}
