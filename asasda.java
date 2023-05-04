package workspace;
import java.util.Scanner;
public class asasda {

	
	
	 public static void main(String[] args) {
	  int inputA = 10;
	  int inputB = 10;
	  int n = 100;
	  int sum = 0;
	  int i, j;

	  for (i = 0; i < inputA; i++) {

	   for (j = 0; j < inputB; j++) {
	    if (j % 10 == 0) {
	     sum = sum + i + inputA;
	    }

	    if (j % 7 == 0) {
	     sum = sum + i + inputA;
	    }
	   }

	  }
	  System.out.print(sum);
	 }
	}     



