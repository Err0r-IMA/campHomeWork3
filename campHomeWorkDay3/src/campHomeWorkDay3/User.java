package campHomeWorkDay3;

public class User {
	
	private int id;
	private	String firstName;
	private	String lastName;
	private	String description;
	
	public User(int id , String firstName,String lastName,String description) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.description = description;		
	}
	public  User(int id) {
		this.id=id;
	}

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	

}
