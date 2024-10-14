package in.basics;


class Box{
	//default constructor: defined by JVM only when we are are defining
   
	//no-arg constructor: when we explicitly defined constructor with zero parameter
	public  Box() {
		System.out.println("calling constructor");
		
	}
}
public class Constructor_I {

	public static void main(String[] args) {
		System.out.println("main() started");
		Box obj = new Box();
		System.out.println("main() completed");

	}

}
