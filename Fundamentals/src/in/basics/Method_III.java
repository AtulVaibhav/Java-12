package in.basics;

public class Method_III {
    
	public void m1() {
		System.out.println("m1() started");
		System.out.println("m1() completed");
	}
	public static void main(String[] args) {
		System.out.println("main() started");
		Method_III obj = new Method_III();
		obj.m1();
		System.out.println("main() completed");

	}

}
