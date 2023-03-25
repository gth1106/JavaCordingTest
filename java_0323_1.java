package JavaProgramming;



public class java_0323_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	2.
//		int x=1;
//		int y=1;
//		boolean isTrue;
//		int nx=++x;
//		int ny=++y;
//		isTrue = x!=y;
//		System.out.println(isTrue);
		
//  3.
//		int x=1;
//		int y=1;
//		int nx = ++x;  x=2 
//		int ny = y++;  
//		  // y=2
//		nx= x++ + ++y; x=2 + y=3 nx= 5
//		System.out.println(nx);
		
  	
//		int x = 0x00001011;
//		int y = 0x1002;
//		System.out.printf("%x",x>>2);
//  5.
//		int x =3;
//		int y=4;
//		x=y=3-5*2%6;
//		System.out.println(x);
	//
//		int x =3;
//		int y=4;
//		boolean isTrue;
//		int nx=x;
//		int ny=++y;
//		isTrue = (x==nx)&&(y==ny);
//		System.out.println(isTrue);
	//
//		int x=3;
//		int y=4;
//		boolean isTrue;
//		int nx=x;
//		int ny=y++;
//		isTrue = (x>nx)||(y<ny);
//		System.out.println(isTrue);
//		int x = 0x00001011;
//		int y = 0x1002;
//		System.out.printf("%x\n",~x);
		int  x1=4;
		int  y1=5;
		int nx=x1;
		int ny=++y1;
		System.out.printf("%x\n",~x1);
		System.out.printf("%x\n",~y1);
//	
		
		int x = 0x00001011;
		int y = 0x00001002;
		System.out.printf("%x\n",~x);
		System.out.printf("%x\n",x>>2);
		System.out.printf("%x\n",x<<2);
		System.out.printf("%x\n",x>>4);
		int a=0x1011;
		int b=4;
		System.out.printf("%x\n",a<<2);
		System.out.printf("%x\n",y<<4);
		System.out.printf("%x\n",y>>2);
		System.out.printf("%x\n",b>>2);
		int x2 = 0x1a11;
		int y2 = 0x1002;
		System.out.printf("%x\n",x2<<2);
		
		
		
	}

}
