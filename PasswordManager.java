package Passwordmanager;

public class PasswordManager {

	private String OldPass ;
	String newPass ;
	String inputPass ; 
	
	void ChangePassword(String OldPass , String newPass) {
		System.out.println("Changed the old Password to the new Password : " + newPass) ;
	}
	
	void validatePassword(String inputPass) {
		if(newPass == inputPass ) {
			System.out.println("The password is incorrect ");
		}
	}
	
}
