package campHomeWork;

public class Student {
	
	
	public Student () {
		
		System.out.println();
	}
	
	public Student(int id, String FirstName,String LastName, String Mail, String Password) {
		
		this();
		this.id = id;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Mail = Mail;
		this.Password = Password;
	
	}
	int id;
	String FirstName;
	String LastName;
	String Mail;
	String Password;
	
	
	

}
