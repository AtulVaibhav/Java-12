package in.basics;

public class Operators {
   public static void main(String[] args) {
	int  x = 10;
	int y = 20;
	int result = (x>y)?1:0;
	System.out.println(result);
	
	int result1 = x<y?(x==y)?'a':'b':'c';
	System.out.println(result1);
	
	// Shift operator:
	int x1 = 10;
	System.out.println(x1<<6);//x*2^m
	System.out.println(x1>>2);//x/2^m
	
	// negation
	int m = -10;
	System.out.println(~m);//  -(m+1)//-11
	
	//instance of :
	
	
//	Integer a = 10;
//	
//	if(a instanceof Integer) {
//		System.out.println(str.length());
//	}
	
	
	
	
}
}
