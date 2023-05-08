package workspace;

public class qsdqdqsd {
	

	 public static void main(String[] args) {
	  int inputA = 10;
	  int inputB = 10;
	  int n = 100;
	  int sum = 0;
	  int i, j;

	  for (i = 0; i < inputA; i++) {

	   for (j = 0; j < inputB; j++) {
	    if (i % 6 == 0 && i % 5 != 0) {
	     sum = sum + i;
	    }
	   }

	  }
	  System.out.print(sum);
	 }
	}    
