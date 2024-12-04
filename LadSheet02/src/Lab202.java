import java.util.*;
public class Lab202 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sumNumber = -2147483648;
		while(true) {
			System.out.print("Input number : ");
			int number = input.nextInt();
			if (number<sumNumber) { break;}
			else {sumNumber=number;}
		}
		System.out.print("\n\nBYE BYE");
		input.close();
	}
}
