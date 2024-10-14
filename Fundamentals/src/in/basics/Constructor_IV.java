package in.basics;

//Copy constructor : cloning

class Student{
	String studentName;
	
	Student(String name){
		studentName = name;
	}
	                
	Student(Student obj){ //obj is having same reference as s1
		studentName = obj.studentName;
	}
	
	
	public void showDetails() {
		System.out.println(studentName);
	}
	
	
}
public class Constructor_IV {

	public static void main(String[] args) {
		Student s1 = new Student("Harsh");
		Student s2 = new Student(s1);
        s1.showDetails();
        s2.showDetails();
	}

}
