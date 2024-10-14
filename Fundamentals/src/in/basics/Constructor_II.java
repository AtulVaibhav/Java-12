package in.basics;

class Employee{
	int empId ;
	String empName;
	
	//parameterized constructor : to initialize an object during creation
	Employee(int id,String name){
		empId = id;
		empName = name;
	}
	
	public void showDetails() {
		System.out.println(empId+" "+empName);
	}
}
public class Constructor_II {

	public static void main(String[] args) {
		Employee e1 = new Employee(101,"Harsh");
		Employee e2 = new Employee(102,"Ankit");
		
		e1.showDetails();
		e2.showDetails();
		
		
		

	}

}
