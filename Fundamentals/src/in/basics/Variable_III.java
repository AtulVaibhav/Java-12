package in.basics;

public class Variable_III {
   
	public static int m1() {
		int a =100;
		return a;
		
	}
	public static void main(String[] args) {
	 //System.out.println(Variable_III.a);
		
//		Variable_III obj = new Variable_III();
//		System.out.println(obj.a);
		
		
		int result = m1();
        System.out.println("Insde main() :"+result);
	}

}
