package campHomeWork;

public class Course {
	
	
	public Course () {
		System.out.println("Parametre almayan kurucu method");
	}
	
	public Course (int id , String courseName,String trainee ) {
	
	this();
	this.id = id ;
	this.courseName = courseName ;
	this.trainee = trainee;
	}


 int id;
 String courseName;
 String trainee ;
 
}