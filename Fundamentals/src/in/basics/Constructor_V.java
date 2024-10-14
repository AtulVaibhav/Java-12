package in.basics;

public class Constructor_V {
	static int count=0;
	
	Constructor_V(){
		count++;
	}
	 public static int getCount() {
		 return count;
	 }
   public static void main(String[] args) {
	 Constructor_V obj = new Constructor_V();
	 Constructor_V obj2 = new Constructor_V();
	 Constructor_V obj3 = new Constructor_V();
	 
	 System.out.println(Constructor_V.getCount());
	 
}
}
