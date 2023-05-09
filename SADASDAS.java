package workspace;

public class SADASDAS {

		 public static void main(String[] args) {
		  // 1에서 100까지의 3으로 나누어 1가 나오는 숫자등의 합을 구하세요

		  int i;
		  int sum = 0; // 합계를 저장하기 위한 변수 선언 및 초기화
		  i = 0; // 초기값
		  int k;
		  while (i < 700) { // 조건식 // 반복문장들
		   k = i + 1;
		   if (k % 3 == 1) {
		    sum = sum + k;
		   }

		   i = i + 1; // 증감식 ( loop variable을 변화시키는 문장
		  }
		  System.out.println(sum);
		 }
		     


	}


