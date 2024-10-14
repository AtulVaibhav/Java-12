package in.basics;

class Vehicle{
	int numberOfWheels;
	String type;
	
	Vehicle(int wheels,String typeOfVehicle){
		numberOfWheels = wheels;
		type = typeOfVehicle;
	}
	
	public void show() {
		System.out.println(numberOfWheels+" "+type);
	}
	
}
public class Query_2 {

	public static void main(String[] args) {
		Vehicle car = new Vehicle(4,"four-wheeler");
		Vehicle cycle = new Vehicle(2,"two-wheeler");
		car.show();
		cycle.show();
		
	}

}
