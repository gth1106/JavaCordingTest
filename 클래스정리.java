
public class 클래스정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/* 클래스 구조
	 *  필드(Field) : 객체의 데이터가 저장되는 곳
	 *  생성자(Constructor) : new 연산자로 호출되는 메소드!로 객체 생성 시 필드의 초기화를담당
	 *  메소드(Method) : 객체의 동작에 해당하며 클래스의 다양한 동작을 구성
	 *  생성자와 메소드는 오버로딩이가능하다 !!
	 *  객체를 무한정 찍어낼수 있다 이러한 객체를 인스턴스(Instance)라한다
	 */
		//클래스 선언
		class 클래스명{
			String name;
			int age;
			int korean_score; //국어성적
			int math_score;  // 수학성적
			// 생성자
			Student(String name, int age, int kor_score,int mat_score){
				this.name= name;
				this.age=age;
				this.korean_score=kor_score;
				this.math_score=mat_score;
				/* int age;
				 * void setAge(int a){
				 *  age= a;
				 * } 
				 * 위와같이 age에 외부의 값을 입력받을 수 있는 setAge( )라는 Setter함수를 선언하였습니다. 
				 * 위에서는 메서드의 인자 변수이름을 int a라 하였는데 
				 * 여기서 인자값의 변수를 필드의 이름과 같이 하려면 어떻게 해야할까요?
this를 사용하면, 메서드의 인수나 변수에 필드와 같은 이름을 붙여도 그것들을 구분하여 사용할 수 있습니다.
 this는 주로 생성자와 메소드의 매개변수 이름이 필드와 동일한 경우, 인스턴스 멤버인 필드임을 명시하고자 할때 사용됩니다.
				 * 
				 */
				
			}
			public void printScore() {
				System.out.println(name);
				System.out.println(age);
				System.out.println(korean_score);
				System.out.println(math_score);
				
			}
		}
	}

}
