import java.util.*;
public class Lab403 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String fullName;
		String firstName;
		
		System.out.print("Please enter your name, seoerated by a space.\n:");
		fullName = input.nextLine(); // fullName = "Robert John "
		int space = fullName.indexOf(' ');
		firstName = fullName.substring(0,space);
		System.out.println(abbreviatName(fullName)+firstName);
		
		
		input.close();
	}
	public static String abbreviatName(String fName) {
		String initalLetter="";
		for (int i = 0; i<fName.length(); i++){
			if(fName.charAt(i)==' ') {
				initalLetter = (initalLetter+fName.charAt(i+1)).toUpperCase();
				initalLetter = initalLetter+".";
			}
		}
		return initalLetter;
	}
}
