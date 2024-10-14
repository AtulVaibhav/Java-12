package in.basics;

public class Method_V {
   public static void main(String[] args) {
	// 1-5
	   print(1);
}
   
  public static void print(int num) {
	  //base condition
	  if(num==6) return;
	  System.out.println(num);
	  print(num+1);//1+1
  }
}
