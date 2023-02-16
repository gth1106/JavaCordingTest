import java.util.*;
import java.util.HashSet;
public class 나머지_3052 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		/* HashSet은 자바 Collection 중 Set의 파생클래스이다.
		 * set 을 집합이라고 생각하면되는데, 특징들이 존재
		 * 1.중복되는 원소를 넣을경우 하나만 저장한다. 즉, 중복원소를 허용하지않는다.
		 * 2.HashSet 은 순서 개념이 없다. 따라서 Collections.sort() 메소드를 사용할수없다.
		 * 만약 정렬을 하고싶다면 리스트로 변환후 정렬해야한다.
		 */
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i=0;i<10;i++) {
			h.add(sc.nextInt()%42);
			// 입력받은 값의 나머지 값을 add 메소드를통해 HashSet에 저장
		}
		sc.close();
		System.out.println(h.size());
	}

}
