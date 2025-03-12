package Passwordmanager;

public class Main {

	public static void main(String[] args) {

		PasswordManager PM = new PasswordManager();
		PM.ChangePassword("Salam", "Hello");
		PM.validatePassword("Bonjour");
		
	}

}
