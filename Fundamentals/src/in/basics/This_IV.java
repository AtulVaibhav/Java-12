package in.basics;

class Dimension{
	int numberOfSides;
	String dimensionName;
	
	Dimension(int numberOfSides,String dimensionName){
		this.numberOfSides = numberOfSides;
		this.dimensionName = dimensionName;
	}
	
	public void show() {
		System.out.println(this.numberOfSides+" "+this.dimensionName);
	}
	
}

public class This_IV {
   public static void main(String[] args) {
	  Dimension d1 = new Dimension(4, "Square");
	  d1.show();
}
}
