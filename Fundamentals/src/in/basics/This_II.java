package in.basics;

class StudentInfo{
	int studentId;
	String studentName;
	
	StudentInfo(int id,String name){
		studentId = id;
		studentName = name;
	}
	
	public void show() {
		int studentId=200;
		String studentName="Joe";
		System.out.println(studentId+" "+this.studentName);
	} 
}


public class This_II {

	public static void main(String[] args) {
		StudentInfo s1 = new StudentInfo(101,"Varun");
		StudentInfo s2 = new StudentInfo(102,"Harsh");
		
		s1.show();
		s2.show();
		

	}

}
