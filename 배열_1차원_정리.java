import java.util.*;
import java.util.Arrays;
public class 배열_1차원_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int 형 배열 선언 & 초기화
		int[] score = new int[5]; // int 타입 값 5개가 저장될 빈 공간 생성
		score[0]=50; // 각 빈공간에 값을 초기화
		score[1]=40;
		score[2]=30;
		score[3]=20;
		score[4]=10;
		System.out.print(score[2]);
		System.out.println();
		// for 문으로 배열을 순사척으로 순회하여 값을 넣어주는 방법
		for(int i=0;i<score.length;i++) {
			score[i]=50-i*10;
			System.out.print(score[i]+" ");
		}
		System.out.println();
		// 처음부터 선언 +초기화 한번에 진행하기 ( 딕셔너리 )
		int[] score2= {50,40,30,20,10};
		
		//String 형 배열 선언 & 초기화
		String[] name=new String[3];
		name[0]="ko";
		name[1]="tae";
		name[2]="hyun";
		//String  처음부터 선언+ 초기화 ( 딕셔너리 )
		String[] strArr2 = {"ko","tae","hyun"};
		// for 문
		for(int i=0;i<name.length;i++) {
			System.out.print(name[i]+" ");
			
		}
		System.out.println();
		System.out.print(strArr2); // 배열의 상태를 보기위해 출력 -> 이 값은 메모리에있는 배열의 주소값이다 !
							//따라서 for 문 이용 배열 각 원소들을 순회하여 출력하도록 설계  || 
							//Arrays.toString() 메소드 이용하기
		System.out.println();
		System.out.println(Arrays.toString(strArr2)); // char 형 배열은 예외인데, 문자같은경우 println으로 바로 출력가능
		
/*  배열은 고정된 크기 -> 배열을 만들고 나서 데이터를 적재하다보면 배열공간의 부족 
 * = > 배열공간의 확장이 필요하다 ! 배열은 ㅎ나번 선언되고 나면 공간 자체를 직접 늘릴수는 없기 떄문에 간접적인 방법으로 배열을 확장해야한다
*  따로 공간이 큰 배열을 새로 만들어주고 기존의 배열의 내용을 새로만든 배열에 복사하는 식으로 하여 배열을 간접적으로 확장하는 방법 !
*  다만, 이러한 작업은 비용이 많이 들기 떄문에 처음부터 배열의 길이를 넉넉하게 잡는 것이 베스트 !!
*  복사방법 1. for 문 순회
*  		 2. System.arraycopy() || Arrays.copyOf() 메소드 사용하기
*  Arrays.copyOf 는 System.arraycopy 를 래핑한 함수일뿐 이다 둘이 동일하다고 보면됌 
*/
		int[] array1 = {10,20,30,40,50};
		
		int[] array2 = new int[array1.length*2]; //초기 배열의 길이보다 두배인 배열을 선언
		for(int i=0;i<array1.length;i++) { //array1 의 길이만큼 반복문 실행
			array2[i]=array1[i]; //array1배열의 원소값을 순회하며 array2 배열에 저장한다
			System.out.print(array2[i]+" ");
		}
		array1=array2; //원래의 배열을 가리키고있던 참조변수 array1이 새로복사된 array2 배열을 가리키도록 한다 
		System.out.println(array1);
		
		
	
	
	} 

}
