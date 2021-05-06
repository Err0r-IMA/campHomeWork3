package campHomeWorkDay3;

public class Student extends User {
	public Student(int id, String firstName, String lastName, String description,String studentNumber) {
		super(id, firstName, lastName, description);
		this.studentNumber=studentNumber;
		// TODO Auto-generated constructor stub
	}

	private String studentNumber;



	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	
}

	
	

