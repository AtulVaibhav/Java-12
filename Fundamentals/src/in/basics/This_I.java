package in.basics;

class Box_I{
	Box_I(){
		System.out.println("Current value of this :"+this.hashCode());
	}
}


public class This_I {

	public static void main(String[] args) {
		Box_I b = new Box_I();
		
		System.out.println("Value of b "+b.hashCode());
		
        Box_I b2 = new Box_I();
		
		System.out.println("Value of b2 "+b2.hashCode());

	}

}
