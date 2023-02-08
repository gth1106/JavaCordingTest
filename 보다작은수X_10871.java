import java.util.*;
public class 보다작은수X_10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		
		int []X=new int[sc.nextInt()];
		int A=sc.nextInt();
		for(int i=0;i<X.length;i++) {
			X[i]=sc.nextInt();
			//System.out.print(X[i]+" ");
			if(X[i]<A) {
				System.out.print(X[i]+" ");
			}
		}

	}

}