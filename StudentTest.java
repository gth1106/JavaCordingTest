package classpart;

public class StudentTest {

	public static void main(String[] args) {
		Student studentAhn = new Student();
		studentAhn.studentName= "안승연";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
	/*
	 *  패키지가 다르면 클래스 이름이 같아도 다른 클래스이다.
	 *  new 예약어로 클래스 생성하기
	 *  클래스형 변수 이름 = new 생성자 ;
	 *  
	 *  클래스가 생성된다는것은 클래스를 실제 사용 할 수 있도록 메모리 공간을 할당 받는것이다.
	 *  이렇게 실제로 사용 할수있도록 생성된 클래스를  '인스턴스'
	 *   인스턴스를 가르키는 클래스형 변수를 ' 참조 변수 '
	 *   
	 *   Student studentAhn = new Student();
	 *   Student 클래스 자료형으로 studentAhn 변수를 선언하고 new Student();
	 *   로 student 클래스를 생성하여 studentAhn에 대입한다는 뜻이다
	 *   
	 *   이때 studentAhn  => 참조변수
	 *   이 변수가 생성된 인스턴스(student 클래스)를 가르킨다
	 */

}
