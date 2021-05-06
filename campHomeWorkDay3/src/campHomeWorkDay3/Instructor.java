package campHomeWorkDay3;

public class Instructor extends User  {
	
	private double maas;
	public Instructor(int id, String firstName, String lastName, String description,double maas) {
		super(id, firstName, lastName, description);
		this.maas=maas;
		// TODO Auto-generated constructor stub
	}
	public double getMaas() {
		return maas;
	}
	public void setMaas(double maas) {
		this.maas = maas;
	}
}
