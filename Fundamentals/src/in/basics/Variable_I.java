package in.basics;

public class Variable_I {
    int data = 100;//instance variable
    
	public static void main(String[] args) {
		//classname obj = new className();
		
		Variable_I obj = new Variable_I();
		Variable_I obj2 = new Variable_I();
		Variable_I obj3 = new Variable_I();
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		System.out.println(obj3.data);
		
		
		System.out.println("_________________________");
		System.out.println("After updation");
		obj.data = 500;
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		System.out.println(obj3.data);
		
		
		
		
		
	//	System.out.println(obj.data);

	}

}
