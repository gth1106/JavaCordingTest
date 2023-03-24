package JavaProgramming;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
          long a = 0, b = 1, c;      
          int i;
          Scanner sc =new Scanner(System.in);
          int count=sc.nextInt();
          
          
          for(i = 1; i <= count; i++) {
        	 System.out.print(a+" ");
             c=a+b;
             a=b;
             b=c;
             
          }
          
    }
}
 