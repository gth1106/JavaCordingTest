package constructor;

//다음 프로그램에서 컴파일 오류가 있으면 -1, 오류가 없으면 0을 답안에 적으시오. 
class Car {
 private String color;
 private int speed;
 public int gear; 
 private int id;  // 자동차의 시리얼 번호

 public Car(String c, int s, int g) {
  color = c;
  speed = s;
  gear = g;
 }

 public Car() {
  color = "red";
  speed = 80;
  gear = 0;
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

public class prvte {
 public static void main(String args[]) {
  Car c1 = new Car("blue", 100, 1); // 첫 번째 생성자 호출
  Car c2 = new Car("white", 0, 1); // 첫 번째 생성자 호출
  
  System.out.println(c1.getSpeed());
 }
}
