import javax.swing.JOptionPane;
public class Lab507 {
	public static void main(String[] args) {
		int[] number = new int[5];
		for (int i = 0; i < number.length; i++) {
			number[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+":"));
		}
		showEvan(number);
		showOdd(number);
	}
	public static void showEvan(int[] _inputNumber01) {
		String number = "";
		for (int numberEvan : _inputNumber01) {
			if (numberEvan%2 == 0) {
				number += numberEvan+" ";
			}
		}
		JOptionPane.showMessageDialog(null, "List of even number: \n"+number);
	}
	public static void showOdd(int[] _inputNumber02) {
		String number = "";
		for (int numberOdd : _inputNumber02) {
			if (numberOdd%2 != 0) {
				 number += numberOdd+" "; 
			}
		}
		JOptionPane.showMessageDialog(null, "List of odd number: \n"+number);
	}
}
