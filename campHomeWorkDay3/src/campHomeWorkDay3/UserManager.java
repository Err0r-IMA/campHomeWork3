package campHomeWorkDay3;

public class UserManager {
	public static void add(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+ " " + "Kullanıcı Eklendi" );
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName()+user.getLastName()+ " " + "Kullanıcı Güncellendi");
	}
	
	public void delete(User user) {
		System.out.println("Kullanıcı Silindi");
		
	}
	public void addDescription(User user) {
		System.out.println("Profil Oluşturuldu !");
	}

}
