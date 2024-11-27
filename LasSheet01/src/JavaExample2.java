import javax.swing.*;
public class JavaExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Dialog Box
		String productName = JOptionPane.showInputDialog("Input Prodict Namr");
		String strproductUnit = JOptionPane.showInputDialog("Input Product Unit");
		int intproductUnit = Integer.parseInt(strproductUnit);
		double porductPrice = Double.parseDouble(JOptionPane.showInputDialog("Input Price per Unit"));
		double totalPriceofPoroduct = intproductUnit*porductPrice;
		// แสดงผล
		double totalwithVat = totalPriceofPoroduct*1.07;
		String frmtotalPriceofPoroduct = String.format("%.2f",totalPriceofPoroduct);
		String frmtotalwithVat = String.format("%.2f",totalwithVat);
		JOptionPane.showMessageDialog(null, "Total Price is "+frmtotalPriceofPoroduct+" baht."
				                       + "\n Add VAT 7% is "+frmtotalwithVat+" baht.");
		


  }
}
