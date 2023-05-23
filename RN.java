package constructor;
// 메소드 객체의 동작

// 필드 객체의 속성
// 클래스의 각각의 객체 - > 인스턴스
//클래스 객체의 설계도
//다음 프로그램에서 컴파일 오류가 있으면 -1, 오류가 없으면 0을 답안에 적으시오. 

class Car {
 private String color;
 private int speed;
 private int gear; 
 private int id;  // 자동차의 시리얼 번호

 public Car(String c, int s, int g) {
  color = c;
  speed = s;
  gear = g;
 }

 public Car() {
  this("red", 80, 0);
 }

 public String getColor() {
  return color;
 }

 public void setColor(String color) {
  this.color = color;
 }

 public int getSpeed() {
  return speed;
 }

 public void setSpeed(int speed) {
  this.speed = speed;
 }
 
 private int getDistance3Hour() {
  int distance; 
  distance = speed * 3;
  return distance;
 }
 
}

public class RN {
	public static void main(String args[]) {
		Car c1 = new Car("blue", 100, 1); // 첫 번째 생성자 호출
		Car c2 = new Car(); // 첫 번째 생성자 호출

		System.out.println(c1.getColor());
	}
}
