
public class 참조변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조변수
		/*
		 *  값이 저장되는 변수
		 *  참조변수는 보통 클래스들인데 일반적으로 메모리 공간이 stack 공간과 heap 공간이 존재한다.
		 *  그래서 클래스의 Myclass c = new Myclass() 라고 가정할때
		 *  c 는 참조변수로써 stack 의 공간에서 주소 저장되어 4byte를 저장한다.
		 *  그리고 그 참조변수의 주소값을 따라가서 heap 공간에 있는 Myclass()를 찾아간다.
		 *  Myclass 의 데이터의 크기는 사용자가 만드는 것에 따라 다르다.
		 *  참조변수는 실제값이 아닌 주소값을 저장한다고 생각하면 된다!
		 *  
		 *  메모리 안을 들여다 보면
		 *  기본형 변수는 stack 의영역에 실제값을 그대로저장 .
		 *  참조형 변수는 stack 영역에 공간을 생성 후 -> heap 영역에 새로운공간을 생성해
		 *  실제값을 저장한 다음에 그 공간의 주소값을 불러와서 stack영역의 공간에 저장한다는것이다.
		 *  참조형변수 == 객체  : 자바  = 객체지향프로그래밍언어
		 */
	}

}
