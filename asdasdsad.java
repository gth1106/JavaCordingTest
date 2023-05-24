package backjoon;

public class asdasdsad {

	
	
	 public static void main(String[] args) {
	  Car myCar = new Car();   // 객체 생성
	  myCar.color = "red";  // 객체의 필드 변경
	  myCar.speed = 0;  // 객체의 필드 변경
	  myCar.gear = 1;   // 객체의 필드 변경
	  myCar.print();   // 객체의 메소드 호출

	  Car yourCar = new Car();  // 객체 생성
	  yourCar.color = "blue";  // 객체의 필드 변경
	  yourCar.speed = 60;  // 객체의 필드 변경
	  yourCar.gear = 3;  // 객체의 필드 변경
	  yourCar.print();   // 객체의 메소드 호출
	  return;
	 }
	}
	class Car {
	 // 필드 정의
	 String color;  // 색상
	 int speed;  // 현재 속도
	 int gear;  // 현재 기어
	 void print() {
	  System.out.print("( " + color + ", " + gear + " )");
	 }
	}