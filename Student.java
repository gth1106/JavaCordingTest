package classpart;

public class Student {
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public String getStudentName() {
		return studentName;
	}

	public static void main(String[] args) {
		Student studentAhn =new Student(); //Student 클래스 생성
		studentAhn.studentName = "안연수";
/*위와 같이 클래스 내부에 main()함수를 만들면 이 클래스가 프로그램의 시작 클래스가 됩니다.
 * 
 */
	}

}
