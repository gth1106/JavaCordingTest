class Date{
	
	private int year;
	private String m;
	private int day;
	public Date(int year,String m,int day) {
		this.year=year;
		this.m=m;
		this.day=day;
		
	}
	public Date() {
		
	}
	public Date(String m) {
		this(2023,m,16);
	}
	public void print() {
		System.out.println(year+"년 "+m+" "+day+"일입니다.");
	}
}
public class _0516DATE메소드 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1= new Date(2023,"5월",16);
		Date date11= new Date("5월");
		date11.print();
	}

}
