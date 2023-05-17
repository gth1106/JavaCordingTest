class Car{
	private int speed;
	private int gear;
	private String color;
//	public Car(){
//		speed=1;
//		gear=1;
//		color="red";
//	}
	//생성자오버로딩 constructor overloading
	public Car(String c,int speed,int g) {
		this.color=c;
//		speed=speed;
		this.speed=speed;
		gear=g;
	}
	public void print() {
		System.out.println(color + "," + speed +"," + gear);
	}
}
public class _0516생성자오버로딩 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car object = new Car("파랑",100,5);
		object.print();
		
		
		

	}

}
