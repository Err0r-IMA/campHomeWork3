package campHomeWorkDay3;

public class UserManager {
	public static void add(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+ " " + "Kullan�c� Eklendi" );
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+ " " + "Kullan�c� G�ncellendi");
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� Silindi");
		
	}
	public void addDescription(User user) {
		System.out.println("Profil Olu�turuldu !");
	}

}
