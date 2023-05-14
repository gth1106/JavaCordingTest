	class Cars {
		public int speed;
		public int mileage;
		private String color;

		public String getColor() {
			return color;
		}

		public void setColor(String color) {
			this.color = color;
		}

		public int getSpeed() {
			return speed;
		}

		public int getMileage() {
			return mileage;
		}

		public int multiSpeed(int multi) {
			int result;
			result = speed * multi -1;
			return result;
		}

	}

public class asdsadawqeqeqweweq{
		public static void main(String[] args) {
			Cars myCar = new Cars();
			myCar.setColor("YELLOW");
			myCar.mileage = 20;
			myCar.speed = 10;
			System.out.println(myCar.mileage + "," + myCar.speed + "," + myCar.multiSpeed(3));
			return;
		}
	}