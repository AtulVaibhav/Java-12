package in.basics;

public class Recursion_IV {
	static int result =1;
	public static void fact(int n) {
		if(n==1) {
			System.out.println(result);
			return;
		}
		result = result*n;
		fact(n-1);
	}
public static void main(String[] args) {
	fact(4);
}
}
