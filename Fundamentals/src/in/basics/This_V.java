package in.basics;


class M{
	M(){
		this(10);
		System.out.println("zero-arg");
		
	}
	
	M(int a){
		System.out.println("one-arg");
	}
}

public class This_V {
  public static void main(String[] args) {
	M m = new M();
}
}
