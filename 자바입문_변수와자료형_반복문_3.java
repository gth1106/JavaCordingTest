
public class 자바입문_변수와자료형_반복문_3 {

	public static void main(String[] args) {
		/*
		 * while 문
		 * while (조건식) { // 조건식이 참인 동안 반복 수행
		 *   	수행문1 ;
		 *    '''
		 *    }
		 *    	수행문2 ;
		 *    '''
		 *    
		 *  do - while 문
		 *  기존의 while 문은 조건식이 참이 아닐시 반복문을 실행하지않는다 .
		 *  하지만 do-while 문은 참이 아니더라도 한번 수행 한 후에 조건식을 검사한다,
		 *  즉, 조건이 만족하는지 여부를 마지막에 검사하는것이다 
		 *  do{
		 *  	수행문1;
		 *  	'''
		 *  }while(조건식);
		 *   	수행문2;
		 *   	'''  
		 * //---------------------------------------------------------
		 *  continue 문 
		 *  반복문 안에서 continue 문을 만나면 이후의 문장은 수행하지 않고 for 문의 처음으로 돌아가 증감식을 수행한다.
		 *  
		 *
		 *    
		 */
		int num = 1;
		int sum = 0;
		
		while(num<=10) {
			
			sum+=num;
			num++;
		}
		System.out.println(sum);
		//-------------------------------------------
		int num2 = 1;
		int sum2 = 0;
		
		do {
			sum2+=num2;
			num2++;
		}while(num2<=10);
		System.out.println(sum2);
	//-------------------------------------------------
		// 1부터 100까지의 홀수의 합
		int total=0;
		
		for(int num3=1;num3<=100;num3++) {
			if(num3%2==0)
				continue;
			
			total+=num3;
			
		}
		System.out.println(total);
		// 3의 배수만 출력하기
		int num4;
		for(num4=1;num4<=100;num4++) {
			if(num4%3!=0)
				continue;
		System.out.print(num4+" ");
				
		
		}
		 int s1 = 0;
		 int n1 ;
		 for(n1=1; ;n1++) { // 조건식 생략엔 ; 형태 중요 !!
			 s1+=n1;
			 if(s1>500)
				 break;
		 }
		 System.out.println();
		 System.out.println(s1);
		 System.out.println(n1);
		
		 
	}
}
