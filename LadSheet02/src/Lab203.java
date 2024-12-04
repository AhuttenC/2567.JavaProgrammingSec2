import javax.swing.*;
public class Lab203 {
	public static void main(String[] args) {
		double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
		double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
		double meterHeight = height/100.0;
		double bmiWeightandHeight = weight / (meterHeight*meterHeight);
		if (bmiWeightandHeight>18.5) {
			JOptionPane.showMessageDialog(null, "BMI = ",
					"BMI",JOptionPane.WARNING_MESSAGE);
		}
	}
}
