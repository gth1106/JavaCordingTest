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
	public void 출력하라() {
		 System.out.println("속도: " + speed + "기어: "+gear);
	}
	public String toString() {
		return "속도: " +speed + " 기어: " +gear +" 색상: " + color;
	}
}
 public class _0502_객체배열참조변수 {
	 public static void main(String[] args) {
			Car myCar;
			myCar = new Car();
			myCar.speed = 10;
			myCar.gear =4;
			myCar.color = new String("AI Big Data 응용소프트웨어과");
			myCar.출력하라();
			Car ohCar;
			
			
			Car yourCar;
			yourCar =new Car();
			yourCar.speed = 30;
			yourCar.gear = 14;
			yourCar.color="빨강";
			yourCar.출력하라();
			yourCar.speedUp();
			yourCar.출력하라();
			
			ohCar = myCar;
			//myCar = yourCar;
			
			
			
			char ch;
			ch = myCar.color.charAt(7);
			System.out.println(ch);
			String s;
			s = ohCar.color.concat(yourCar.color);
			System.out.println(s);
			System.out.println(myCar.color.length());
			System.out.println(myCar.color.toUpperCase());
			System.out.println(myCar.color.substring(0,5));
			
			
			String st1= new String("A반");
			String st2= new String("B반");
			String st3= new String("A반");
			
			System.out.println(st1.equals(st2));
			System.out.println(st1.equals(st3));
			// 이것은 객체안의 문자를 직접비교하는것이다.
			
			if(st1==st2) {
				System.out.println("같다");
			}
			else {
				System.out.println("다르다");
			} // 객체의 주소값이 다르기에 else 문으로
			System.out.println(myCar.color.replace('A','B'));
			//메소드 호출시 전달하는 값을 인수(argument)
			// 메소드에서 값을 받을 때 사용하는 변수를 매개 변수(parameter)
			
			Integer obj = new Integer(10);
			byte b=obj.byteValue();
			System.out.println(b);
			String ss1 = Integer.toHexString(100);
			System.out.println(ss1);
		}

}
