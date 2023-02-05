import java.util.*;
public class 에이플러스비마4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in); //종료시점이 없을때는 어떻게해야할까
		// 읽을 데이터가 없으면 예외가 던져진다
		// Scanner 의 메소드 hasNext();
		
	    while(sc.hasNextInt()) {
	    	int a=sc.nextInt();
	    	int b=sc.nextInt();
	    	System.out.println(a+b);
	    	
	    }
	    sc.close();
		
	}

}
