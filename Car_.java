package workspace2;
class Car{
	static final int MAX_SPEED = 350; //정적 상수(constant) 클래스에 단 하나만
	private String color;
	private int speed;
	private int gear;
	private int id;
	private static int numberOfCars = 0;
	
//	public Car(String c, int s, int g) {
//		color=c;
//		speed=s;
//		gear=g;
//	}
	public Car() {
		color = "흰색";
		speed = 0;
		gear = 0;
		id = ++numberOfCars;
	}
	public static int getNumberOfCars() { //정적 메서드
		//speed=10;
		return numberOfCars;
	}
//	public static void setNumberOfCars(int numberOfCars) {
//		Car.numberOfCars = numberOfCars;
//	}
	public void print() {
		System.out.println(id+ " : " + color+" ,"+speed+","+gear);
	}
}
public class Car_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Car c1 = new Car();
//		c1.print();
//		Car c2 = new Car();
//		c2.print();
		System.out.println(Car.getNumberOfCars());
		//static method
		//Math
		double value = Math.sqrt(9);
		System.out.println(value);
		
	}

}
