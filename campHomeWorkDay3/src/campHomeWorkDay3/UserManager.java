package campHomeWorkDay3;

public class UserManager {
	public static void add(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+ " " + "Kullanýcý Eklendi" );
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+ " " + "Kullanýcý Güncellendi");
	}
	
	public void delete(User user) {
		System.out.println("Kullanýcý Silindi");
		
	}
	public void addDescription(User user) {
		System.out.println("Profil Oluþturuldu !");
	}

}
