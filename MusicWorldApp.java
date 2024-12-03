import javax.swing.JOptionPane;
public class MusicWorldApp {
    public static void main(String[] args){
        String cdid = JOptionPane.showInputDialog("This progeam calculates the total cost of a CD order \nPlease enter the ID of the CD");
        String cdTitle = JOptionPane.showInputDialog("Please enter the title of the CD");
        double cdPrice = Double.parseDouble(JOptionPane.showInputDialog("Please enter the price of the CD in U.S. dollars"));
        double cdQuantity = Double.parseDouble(JOptionPane.showInputDialog("Please rnter the quantity to be purchased"));
        double cdSubtotal , cdTotal , tax_Rate = 6.25;
        cdSubtotal = cdPrice*cdQuantity;
        cdTotal = cdSubtotal+(cdSubtotal * tax_Rate / 100.0);

        String message = String.format("Summary of the teansaction:\n\n" +
                "CD ID: %s \nCD Title: %s \nCD Unit Price: $%,.2f \nCD Quantity: %,.0f\n\n" +
                "Subtotal: $%,.2f \nTax rate: %,.2f%%\nTotal: $%,.5f\n\nEnd of Program"
                ,cdid,cdTitle,cdPrice,cdQuantity,cdSubtotal,tax_Rate,cdTotal);
        JOptionPane.showMessageDialog(null,message);
    }
}
