import java.util.*;
public class SecurePasswordChecker {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("Enter your password(type 'exit' to quit):");
			String password = scan.next();
			if (password.contentEquals("exit")) {
				System.out.println("Program terminated.");
				break;
			}
			String error="";
			if (password.length()<8) {
				error += "-Password must be at least 8 characters long.\n";
			}
			boolean hasUpperCase = false;
			boolean hasLowerCase = false;
			boolean hasDigit = false;
			for (int i = 0; i <password.length(); i++) {
				char ch = password.charAt(i);
				if (ch >= 'A' && ch <= 'Z') {
					hasUpperCase = true;
				}
				else if (ch >= 'a' && ch <= 'z') {
					hasLowerCase = true;
				}
				else if (ch >= '0' && ch <= '9') {
					hasDigit = true;
				}
			}
			if (!hasUpperCase) { error +="-password must comtain at lease one upercase letter (A-Z).\n"; }
			if (!hasLowerCase) { error += "-password must comtain at lease one lowecase letter (a-z).\n"; }
			if (!hasDigit) error += "-password must comtain at lease one digut(0-9).\n";
			
			if (error.isEmpty()) {
				System.out.println("Your password is secure");
				break;
			}
			else {
				System.out.println("Password validation errors.");
				System.out.println(error);
			}
		}
		scan.close();
	}

}