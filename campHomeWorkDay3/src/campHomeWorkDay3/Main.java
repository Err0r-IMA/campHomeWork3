package campHomeWorkDay3;

public class Main {

	public static void main(String[] args) {
	StudentManager manager=new StudentManager();
	Student student=new Student(5,"Ahmet","Kiroðlu","Öðrenci","123456");
	manager.add(student);

	
	UserManager userManager = new UserManager();
	Instructor instructor = new Instructor(10, "Engin", "Demirog","Öðretmen", 150);
	
	Instructor instructor1 = new Instructor(25,"Kerem ","Varýþ","Öðretmen",125);
	
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.add(instructor1);
	instructorManager.add(instructor);
	
	
	Instructor[]instructors = {instructor,instructor1};
	
	}

}

