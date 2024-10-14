package in.basics;

public class StaticBlock {
	static int data;
    static {
    	data = 20;
    	
    }
    
    public void m1() {
    	System.out.println(StaticBlock.data);
    }
    
	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		StaticBlock obj2 = new StaticBlock();
		obj.m1();
		obj2.m1();
		

	}

}
