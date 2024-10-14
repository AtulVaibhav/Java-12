package in.basics;

public class Recursion_I {
    
	public static void printNumber(int num) {
		if(num>10) return;
		System.out.println(num);
		printNumber(num+1);
	}
	public static void main(String[] args) {
		printNumber(1);

	}

}
