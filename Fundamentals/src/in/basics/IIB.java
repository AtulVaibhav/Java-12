package in.basics;

public class IIB {
	static int count;
    static {
    	count=0;
    }
    
    {
    	count++;
    }
    
    public static int getCount() {
    	return count;
    }
	public static void main(String[] args) {
		IIB obj = new IIB();
		IIB obj2 = new IIB();
		IIB obj3 = new IIB();
		System.out.println(IIB.getCount());

	}
 
}
