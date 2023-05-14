//
//public class asdasdaqww {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//	   
//	   public boolean isEqual(Car c) {
//	      if (c.speed == speed) {
//	         return true;
//	      }
//	      return false;
//	   }
//	}
//
//	public class A1 {
//
//	   public static void main(String[] args) {
//	      // TODO Auto-generated method stub
//	      
//	      Car myCar = new Car();
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      
//	      Car yourCar = new Car();
//	      yourCar.speed = 10;
//	      yourCar.mileage = 20;
//	      
//	      if (myCar.isEqual(yourCar)) {
//	         System.out.println("1");
//	      }else {
//	         System.out.println("2");
//	      }
//	   }
//
//	}
//	// 1
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//	   public int getSpeed() {
//	      return speed;
//	   }
//	   public int getMileage() {
//	      return mileage;
//	   }
//	   public void print(int speed) {
//	      int result = mileage * speed;
//	      this.speed = speed + result;
//	      return;
//	   }
//
//	   public String test(Car car) {
//	      car.print(2);
//	      this.speed = car.getSpeed();
//	      return car.getColor() + this.color;
//	   }
//
//	   public boolean isEqual(Car c) {
//	      if (c.speed != speed) {
//	         return true;
//	      }
//	      return false;
//	   }
//
//	}
//
//
//	public class A2 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("green");
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      myCar.print(50);
//
//	      Car yourCar = new Car();
//	      yourCar.speed = 2;
//	      yourCar.setColor("yellow");
//	      yourCar.mileage = 15;
//
//	      System.out.println(yourCar.isEqual(myCar));
//	      return;
//	   }
//	}
//
//	// true
//
//
//
//
//	public class A3 {
//	   public static void main(String[] args) {
//	      String proverb1 = new String("258");
//	      String proverb2 = new String("137.4");
//	      int a, b, c, d;
//	      double e, f;
//	      String s1, s2, s3, s4;
//
//	      a = b = c = d = 30;
//
//	      s1 = proverb2 + Double.parseDouble(proverb2);
//
//	      System.out.println(s1);
//
//	      return;
//	   }
//	}
//
//	// 137.4137.4
//
//
//
//
//	public class A4 {
//	   public static void main(String[] args) {
//	      String proverb1 = new String("358");
//	      String proverb2 = new String("137");
//	      int a, b, c, d;
//	      String s1, s2, s3, s4;
//
//	      a = b = c = d = 30;
//
//	      d = a + Integer.parseInt(proverb1);
//
//	      System.out.println(d);
//
//	      return;
//	   }
//	}
//
//	// 388
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	   public void print(int speed) {
//	      int result = mileage * speed;
//	      this.speed = speed + result;
//	      return;
//	   }
//
//	   public String test(Car car) {
//	      car.print(2);
//	      this.speed = car.getSpeed();
//	      return car.getColor() + this.color;
//	   }
//
//	}
//
//	public class A5 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("YELLOW");
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      myCar.print(50);
//
//	      Car yourCar = new Car();
//	      yourCar.speed = 2;
//	      yourCar.setColor("yellow");
//	      yourCar.mileage = 15;
//
//	      System.out.println(yourCar.test(myCar));
//	      return;
//	   }
//	}
//
//	// YELLOWyellow
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	   public void print(int speed) {
//	      int result = mileage * speed;
//	      this.speed = speed + result;
//	      return;
//	   }
//
//	}
//
//	public class A6 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("green");
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      myCar.print(50);
//
//	      Car yourCar = new Car();
//	      yourCar.setColor("yellow");
//	      yourCar.mileage = 25;
//	      yourCar.print(20);
//	      System.out.println(myCar.mileage + "," + yourCar.speed);
//	      return;
//	   }
//	}
//
//	// 20,520
//
//
//
//
//	public class A7 {
//	   public static void main(String[] args) {
//	      String proverb1 = new String("8");
//	      String proverb2 = new String("37.4");
//	      int a, b, c, d;
//	      double e, f;
//	      String s1, s2, s3, s4;
//
//	      a = b = c = d = 43;
//	      f = a / 5.0;
//	      s1 = "1" + f;
//	      e = c + Double.parseDouble(s1);
//	      s4 = proverb1 + e;
//
//	      System.out.println(s4);
//
//	      return;
//	   }
//	}
//
//	// 861.6
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	   public void print(int speed) {
//	      int result = mileage * speed;
//	      this.speed = speed + result;
//	      return;
//	   }
//
//	   public String test(Car car) {
//	      car.print(2);
//	      this.speed = car.getSpeed();
//	      return car.getColor() + this.color;
//	   }
//
//	   public boolean isEqual(Car c) {
//	      if (c.speed == speed) {
//	         return true;
//	      }
//	      return false;
//	   }
//
//	}
//
//	public class A8 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("green");
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      myCar.print(50);
//
//	      Car yourCar = new Car();
//	      yourCar.speed = 10;
//	      yourCar.setColor("yellow");
//	      yourCar.mileage = 20;
//
//	      if (myCar.isEqual(yourCar)) {
//	         System.out.println("1");
//	      } else {
//	         System.out.println("2");
//	      }
//	      return;
//	   }
//	}
//
//	// 2
//
//
//
//
//
//	public class A9 {
//	   public static void main(String[] args) {
//	      String proverb1 = new String("258");
//	      String proverb2 = new String("137.5");
//	      int a, b, c, d;
//	      double e, f;
//	      String s1, s2, s3, s4;
//
//	      a = b = c = d = 30;
//
//	      f = a + Double.parseDouble(proverb2);
//
//	      System.out.println(f);
//
//	      return;
//	   }
//	}
//
//	// 167.5
//
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	   public int multiSpeed(int multi) {
//	      int result;
//	      result = speed * multi;
//	      return result;
//	   }
//
//	}
//
//	public class B10 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("YELLOW");
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      System.out.println(myCar.mileage + "," + myCar.speed + "," + myCar.multiSpeed(3));
//	      return;
//	   }
//	}
//
//	// 20,10,30
//
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	}
//
//	public class B11 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("YELLOW");
//	      myCar.mileage = 10;
//	      myCar.speed = myCar.getMileage() * 20;
//	      System.out.println(myCar.mileage + "," + myCar.speed + "," + myCar.getColor());
//	      return;
//	   }
//	}
//
//	// 10,200,YELLOW
//
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public boolean isEqual(Car c) {
//	      if (c.speed == speed) {
//	         return true;
//	      }
//	      return false;
//	   }
//
//	}
//
//	public class B12 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//
//	      Car yourCar = new Car();
//	      yourCar.speed = 10;
//	      yourCar.mileage = 20;
//
//	      if (yourCar == myCar) {
//	         System.out.println("1");
//	      } else {
//	         System.out.println("2");
//	      }
//	      return;
//	   }
//	}
//
//	// 2
//
//
//
//
//
//	class Car {
//
//	   String color;
//	   int speed;
//	   int gear;
//
//	   void print() {
//	      System.out.println("( " + color + ", " + gear + " )");
//	   }
//	}
//
//	public class B13 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.color = "red";
//	      myCar.speed = 0;
//	      myCar.gear = 1;
//	      myCar.print();
//
//	      return;
//	   }
//	}
//
//	// ( red, 1 )
//
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	   public void print(int speed) {
//	      int result = mileage * speed;
//	      this.speed = speed + result;
//	      return;
//	   }
//
//	}
//
//	public class B14 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("YELLOW");
//	      myCar.mileage = 10;
//	      myCar.speed = 10;
//	      myCar.print(30);
//	      System.out.println(myCar.mileage + "," + myCar.speed);
//	      return;
//	   }
//	}
//
//	// 10,330
//
//
//
//
//
//	class Car {
//	   public int speed;
//	   public int mileage;
//	   private String color;
//
//	   public String getColor() {
//	      return color;
//	   }
//
//	   public void setColor(String color) {
//	      this.color = color;
//	   }
//
//	   public int getSpeed() {
//	      return speed;
//	   }
//
//	   public int getMileage() {
//	      return mileage;
//	   }
//
//	   public void print(int speed) {
//	      int result = mileage * speed;
//	      this.speed = speed + result;
//	      return;
//	   }
//
//	}
//
//	public class B15 {
//	   public static void main(String[] args) {
//	      Car myCar = new Car();
//	      myCar.setColor("green");
//	      myCar.mileage = 20;
//	      myCar.speed = 10;
//	      myCar.print(50);
//
//	      Car yourCar = myCar;
//	      yourCar.mileage = 25;
//	      yourCar.print(10);
//	      System.out.println(myCar.mileage + "," + yourCar.speed);
//	      return;
//	   }
//	}
//
//	// 25,260
//
