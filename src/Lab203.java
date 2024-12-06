import javax.swing.*;
import java.text.*;
public class Lab203 {
    public static void main(String[] args) {
        DecimalFormat frm = new DecimalFormat("#.0");
        double weight = Double.parseDouble(JOptionPane.showInputDialog("Input Weight:"));
        double height = Double.parseDouble(JOptionPane.showInputDialog("Input Height:"));
        double meterHeight = height/100.0;
        String bmi = "";
        double bmiWeightandHeight = weight / (meterHeight*meterHeight);
        if (bmiWeightandHeight<18.5) { bmi = "Under-weight"; }
        else if (bmiWeightandHeight>=18.5&&bmiWeightandHeight<=24.9){ bmi = "Normal-weight"; }
        else if (bmiWeightandHeight>=25.0&&bmiWeightandHeight<29.9) { bmi = "Over-weight"; }
        else if (bmiWeightandHeight>=33.0){ bmi = "Obesity"; }
        else { bmi = "Error"; }
        JOptionPane.showMessageDialog(null,
                "BMI ="+frm.format(bmiWeightandHeight)+"\nYou're "+bmi,
                "BMI",JOptionPane.WARNING_MESSAGE);
    }
}
