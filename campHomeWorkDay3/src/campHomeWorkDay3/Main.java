package campHomeWorkDay3;

public class Main {

	public static void main(String[] args) {
	StudentManager manager=new StudentManager();
	Student student=new Student(5,"Ahmet","Kiro�lu","��renci","123456");
	manager.add(student);

	
	UserManager userManager = new UserManager();
	Instructor instructor = new Instructor(10, "Engin", "Demirog","��retmen", 150);
	
	Instructor instructor1 = new Instructor(25,"Kerem ","Var��","��retmen",125);
	
	InstructorManager instructorManager = new InstructorManager();
	instructorManager.add(instructor1);
	instructorManager.add(instructor);
	
	
	Instructor[]instructors = {instructor,instructor1};
	
	}

}

