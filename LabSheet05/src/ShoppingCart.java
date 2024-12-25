import javax.swing.*;
public class ShoppingCart {
	public static void main(String[] args) {
		splayCardAndTotal("Apple",10.5,"Banana",5.75,"Orange",7.3);
		splayCardAndTotal("Milk",20.0,"Bread",15.0);
		splayCardAndTotal();
	}
	private static void splayCardAndTotal(Object... items) {
		if (items.length == 0 ) {
			System.out.println("\nNo items in the cart.");
			return;
		}
		System.out.println("Items in the cart:");
		for (int i = 0; i < items.length; i+=2) {
		
			String itemsName = (String)items[i];
			double itemsPrice = (double)items[i+1];
			
			// JOptionPane.showMessageDialog(null, "- "+itemsName+": $"+itemsPrice);
			System.out.printf("- %s: $%.2f%n",itemsName,itemsPrice);
		
		}
		System.out.println();
	}
}
