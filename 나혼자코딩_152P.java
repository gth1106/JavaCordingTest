package classpart;

class Person{
		int age;
		String name;
		boolean married;
		int children;
}

public class 나혼자코딩_152P {

	public static void main(String args[]) {
		Person Man = new Person();
		Man.name="James";
		Man.age=40;
		Man.children=3;
		Man.married=true;
		System.out.println(Man.name);
		System.out.println(Man.age);
		System.out.println(Man.children);
		System.out.println(Man.married);
	}
}

