package in.basics;

public class Recursion_III {
	static int result=1;
	public static void pow(int m,int n) {
		if(n==0) {
			System.out.println(result);
			return;
		}
		result =result * m;
		pow(m,n-1);
	}
  public static void main(String[] args) {
	pow(2,3);
}
}
