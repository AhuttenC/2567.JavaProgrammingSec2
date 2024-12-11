import javax.swing.*;
public class Lab302 {

	public static void main(String[] args) {
		String inputEmail = JOptionPane.showInputDialog("Input you e-mail:").toLowerCase();
		boolean chkEmail = false;
		
		while(true) {
			inputEmail = JOptionPane.showInputDialog("input your your e-mail:").toLowerCase();
			while(inputEmail.startsWith("@")||inputEmail.contains(" ")) {
				inputEmail = JOptionPane.showInputDialog("input your your e-mail,again:").toLowerCase();
			}
			chkEmail =inputEmail.endsWith("@gmail.com")||inputEmail.endsWith("hotmail.con");
			if (chkEmail) {
				JOptionPane.showMessageDialog(null, "Your e-mail is "+inputEmail);
				break;
			}
			else {
				JOptionPane.showMessageDialog(null, "Your e-mail is not hotmail or gmail dot com");
				continue;
			}
		}
	}
}
