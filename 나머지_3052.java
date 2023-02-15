import java.util.*;
public class 나머지_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		// 7 14 27 38
		int[] arr=new int[10];
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]%42!=0) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}

}
