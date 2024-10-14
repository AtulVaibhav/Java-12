package in.basics;

public class Method_I {
	
	
	//function definition
   public static void m1() {
	  System.out.println("static method called");
	  
   }
   
   public static String getName() {
	   return "Harsh";
   }
   
   public static void getNumber(int num) {
	   if(num%2==0) {
		   System.out.println(num);
		   return;
	   }
	   System.out.println(num*num);
   }
   
   
   
   
	public static void main(String[] args) {
		System.out.println("main method started");
        
		//invoke a fn or calling a fn
		Method_I.m1();
		
		String name = Method_I.getName();//"Harsh"
		System.out.println(name);
		
		Method_I.getNumber(2);
		
	}

}
