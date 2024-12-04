import javax.swing.*;
import java.text.*;
public class Lab201 {

	public static void main(String[] args) {
		final int BUFFET = 299;
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		int numberofCustomber = Integer.parseInt(JOptionPane.showInputDialog("How many customber per bill?"));
		double totalPrice = numberofCustomber*BUFFET;
		//System.out.printf("Total Price is %,.2f baht.",totalPrice);
		while (true) {
		int isMember = JOptionPane.showConfirmDialog(null, "Total Price is "+frm.format(totalPrice)+" baht."
				                                       + "\nDo ypu have a menber card?");
		if (isMember == JOptionPane.YES_OPTION) { // if (isMember == 0)
			double discount = totalPrice*0.90;// disconut == totalPrice - (totalPrice /0.10);
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(discount)+" baht.");
			break;
		}
		else if (isMember == JOptionPane.NO_OPTION) {// else if (isMember == 1)
			JOptionPane.showMessageDialog(null, "Amount to be paid is "+frm.format(totalPrice)+" baht.");
			break;
		}
	  }
	}
}
