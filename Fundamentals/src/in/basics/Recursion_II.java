package in.basics;

public class Recursion_II {
	public static void getChar(int n) {
		if(n>90) return;
		System.out.println((char)n);
		getChar(n+1);
	}
   public static void main(String[] args) {
	getChar(65);
}
}
