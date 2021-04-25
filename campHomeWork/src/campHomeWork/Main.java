package campHomeWork;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		
		student1.id = 5451;
		student1.FirstName ="Ahmet";
		student1.LastName = "Kıroğlu";
		student1.Mail ="muratahmetkiroglu@gmail.com : ";
		student1.Password ="12345";
		
		
		Student student2 = new Student ( 15,"mehmet","selim","selimmehmet@gmail","656");
		
		
		Student[]students = {student1,student2};
		
		
		
		
		
		Course course1 = new Course();
		course1.courseName = "Java-React";
		course1.trainee = "Engin Demiroğ";
		course1.id =1;
		
		
		Course course2 = new Course();
		course2.courseName = "C#";
		course2.trainee = "Engin Demiroğ";
		course2.id =2;
		
		
		Course[]courses = {course1,course2};
		
		
		for (Course course : courses) {
			System.out.println(course.courseName );
			
		}
		
		
		
        for (Student student : students) {
        	System.out.println(student.FirstName);
			
		}
		

	
		

	}

}
