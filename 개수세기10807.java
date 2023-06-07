import java.util.*;
public class 개수세기10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr1= new int[sc.nextInt()];
		int x=0;
		
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
			
			
		}
		int v=sc.nextInt();
		for(int i=0;i<arr1.length;i++) {
			if(v==arr1[i]) {
				x++;
			}
		}
		System.out.println(x);
		

	}

}
