import javax.swing.*;
import java.util.*;
public class Icecream {
    public static void main(String[] args){
        final int VANILLA = 10;
        final int CHOCOLATE = 15;
        final int TOPPING = 5;
        int numberIceCream;
        String iceCream1 = "Vanilla";
        String iceCream2 = "Chocolate";
        while (true){
            numberIceCream = Integer.parseInt(JOptionPane.showInputDialog("[1] Vanilla Flavor 10 B." +
                                                                        "\n[2] Chocolate Flavor 15 B." +
                                                                        "\nPress number to choose flavor:"));
            if (numberIceCream == 1 || numberIceCream == 2) { break; }
            JOptionPane.showMessageDialog(null,"ERROR: Wrong choice!" +
                                                                    "\nTry again...","ERROR",JOptionPane.ERROR_MESSAGE);
        }
        int topping = JOptionPane.showConfirmDialog(null,"Do you want to add topping?","Topping",JOptionPane.YES_NO_OPTION);
        int iceCreamtotal = (numberIceCream == 1) ? VANILLA : CHOCOLATE;
        String iceCresmSr = (numberIceCream == 1) ? iceCream1 : iceCream2;
        int iceTopping = (topping == JOptionPane.YES_OPTION) ? iceCreamtotal+TOPPING : iceCreamtotal;
        JOptionPane.showMessageDialog(null,"You choose "+iceCresmSr+" Flavor " +
                                                                "\nAnd no topping" +
                                                                "\nTotal price = "+iceTopping+" baht.");

    }
}
