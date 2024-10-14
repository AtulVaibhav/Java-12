package in.basics;

public class Method_II {
	int data = 100;
	static int data2 = 500;
	
	public static void m1(Method_II a) {
		
		System.out.println(Method_II.data2);
		System.out.println(a.data);
	}
	
	public void m2(Method_II a) {
		int data =1000;
		System.out.println(Method_II.data2);
		//System.out.println(data);//not recommended
		System.out.println(a.data);
	}
	
    public static void main(String[] args) {
	
		Method_II obj = new Method_II();
		System.out.println(obj);
		Method_II.m1(obj);
		
		new Method_II().m2(obj);
		
	}
}
