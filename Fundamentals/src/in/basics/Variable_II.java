package in.basics;

public class Variable_II {
    static int data = 100;//static variable
	public static void main(String[] args) {
		//Using className: recommendation
		
		//System.out.println(Variable_II.data);
		
		//Using object
		
		Variable_II obj = new Variable_II();
		Variable_II obj2 = new Variable_II();
		Variable_II obj3 = new Variable_II();
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		System.out.println(obj3.data);
		
		
		System.out.println("_________________________");
		System.out.println("After updation");
		obj.data = 500;
		
		System.out.println(obj.data);
		System.out.println(obj2.data);
		System.out.println(obj3.data);
		
		

	}

}
