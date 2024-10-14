package in.basics;

// singleton design pattern
class AInfo{
	int data = 10;
	
	//Object
    public String toString() {
    	return "data = "+this.data;
    }
}
public class Query2 {
    public static void main(String[] args) {
		AInfo obj = new AInfo();
		System.out.println(obj);
	}
}
