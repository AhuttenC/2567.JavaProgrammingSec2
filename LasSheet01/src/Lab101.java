import java.util.*;
import java.text.*;
public class Lab101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Input Prodoct Name    : ");
		String productName = input.nextLine();
		System.out.print("Input Prodoct Unit    : ");
		int productunint = input.nextInt();
		System.out.print("Input Price per unit  : ");
		double productundouble = input.nextDouble();
		System.out.println("--------------------------------------------------");
		double totalPrice = productunint*productundouble;
        String femtotalPrice = String.format("%,.2f", totalPrice);
		System.out.println("Total Price is "+femtotalPrice+" baht.");
		System.out.println("--------------------------------------------------");
		System.out.print("How many discount (%) : ");
		double discount = input.nextDouble();
		double totaldicount = totalPrice*(discount/100.0);
		double totalAmount = totalPrice-totaldicount;
		System.out.println("--------------------------------------------------");
		String femtotaldicount = String.format("%,.2f", totaldicount);
		String femtotalAmount = String.format("%,.2f", totalAmount);
        System.out.println("Discount from "+discount+"%\t\t"+femtotaldicount+" baht."
        		+ "\nAmount to be paid\t\t"+femtotalAmount+" baht.");
        input.close();
	}

}
