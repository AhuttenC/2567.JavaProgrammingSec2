import javax.swing.JOptionPane;
public class Lab104
{
    public static void main(String[] args){
        double earnings ,taxRate , tax , sumEarnings;
        JOptionPane.showMessageDialog(null,"Welcome to the payroll application");
        String name = JOptionPane.showInputDialog("Enter employee name");
        int employeeWorked = Integer.parseInt(JOptionPane.showInputDialog("Enter total hours for this employee."));
        double employyeWage = Double.parseDouble(JOptionPane.showInputDialog("Enter toral hours for employee."));
        earnings = employeeWorked*employyeWage;
        taxRate = employyeWage / 50;
        tax = taxRate*earnings;
        sumEarnings = earnings-tax;
        String message = String.format("Employee name: %s \n" +
                " Hours worked: %.1f\nHourly wage: $ %.1f\nGross earnings:$ %.1f" +
                "\nTax rate:%.2f\nTax:$ %.1f \n Net earnings:$ %.1f",name,(double) employeeWorked,employyeWage,earnings,taxRate,tax,sumEarnings);
        JOptionPane.showMessageDialog(null,message);


    }
}
