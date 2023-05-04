package workspace;


class Car{
	public int speed;
	public int gear;
	public String color;
	
	public Car() {
		speed =0;
		gear = 4;
		color = "red";
	}
	public void speedUp() {
		speed +=10;
	}
	public String toString() {
		return "속도: " +speed + " 기어: " +gear +" 색상: " + color;
	}
}
 public class _0502_객체배열참조변수 {
	public static void main(String[] args) {
		
		final int NUM_CARS = 5;
		Car[] cars = new Car[NUM_CARS];
		for( int i=0;i<cars.length;i++) {
			cars[i]=new Car();
		}
		for(int i=0;i<cars.length;i++) {
			cars[i].speedUp();
		}
		cars[0].gear=5;
		System.out.println(cars[1]);
		for (Car value : cars) {
			value = new Car();
			value.gear=5;
			value.speed=6;
			System.out.println(value);
		}
		
	}

}
