package passwortverwaltungssoftware;


public class Anmeldung {

	public static void main(String[] args) {
		
		Gui.opengui();
		
		
	}

	
	public static void SignInButton() {
		
		System.out.println("Sign in pressed!");
		
		//System.out.println("Name:" + Gui.txtName.getText());
		//System.out.println("Passwort:" + Gui.textPasswort.getText());
		
	}
	
	public static void CreateAccButton() {
		
		System.out.println("Create Account pressed!");
		
	}
	
	public static void PassChangeButton() {
		
		System.out.println("Change Password pressed!");
		
	}
	
	public static void PassLostButton() {
		
		System.out.println("Lost Password pressed!");
		
	}
}
