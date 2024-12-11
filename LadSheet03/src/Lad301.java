import java.util.*;
public class Lad301 {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//กำหนดตัวแปร text
		String txtConcate = "";
		String word;
		while (true) {
			System.out.print("Enter word: ");
			word = kb.next();
			if (word.equalsIgnoreCase("stop")) { 
				System.out.print("Program Terminate");
				break; 
				}
			txtConcate += word+" ";
			}
		System.out.print(txtConcate.toUpperCase());
		
		kb.close();
	}
}