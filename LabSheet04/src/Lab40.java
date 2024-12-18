import javax.swing.*;
public class Lab40 {
	public static void main(String[] args) {
		inputEmail();
	}
	public static void inputEmail() {
		String ans;
        String varEmail;
		do {
			varEmail = JOptionPane.showInputDialog("Input your e-mail: ");
			if (varEmail!=null && !varEmail.isEmpty()) {
				//
				checkEmailError(varEmail);
			}
			else {
				JOptionPane.showMessageDialog(null, "E-mail cannot be empty!!!");
			}
			ans=JOptionPane.showInputDialog("Do you want to input email address[Y/y]: ");
		} while(ans != null && ans.equalsIgnoreCase("Y"));
	}
	public static void checkEmailError(String email) {
		while(email.startsWith("@") || email.contains(" ")) {
			email = JOptionPane.showInputDialog("Invalid e-mail. Input your e-mail again:");
		}
		email = email.toLowerCase();
		JOptionPane.showMessageDialog(null, 
				cherkEmail(email)? "Yoor e-mail is "+email : "Your e-mail is not or gmail address.");
	}
	public static boolean cherkEmail(String email01) {
		/* if (email01.endsWith("@gmait.com") || email01.endsWith("@hotmail.com")) {
			return true;
		}
		else { return false; } */
		return  (email01.endsWith("@gmail.com") || email01.endsWith("@hotmail.com"));
		
	}
}
