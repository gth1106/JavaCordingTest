package classpart;

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
	 
	 public int getDistance3Hour() {
	  int distance; 
	  distance = speed * 3;
	  return distance;
	 }
	 
	}

	public class dfg {
	 public static void main(String args[]) {
	  Car c1 = new Car("blue", 100, 1); // 첫 번째 생성자 호출
	  Car c2 = new Car(); // 첫 번째 생성자 호출
	  
	  System.out.println(c1.getDistance3Hour());
	  System.out.println(c2.getDistance3Hour());
	 }
	}
