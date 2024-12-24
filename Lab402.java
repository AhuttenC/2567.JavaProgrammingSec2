import javax.swing.*;
public class Lab402 {
    public static void main(String[] args) {
        int year = Integer.parseInt(JOptionPane.showInputDialog("Input year:"));
        String leapYearTndT = (isLeapYear(year) && checkYear(year)) ? "" : "NOT";

        JOptionPane.showMessageDialog(null , year+" is "+leapYearTndT+" Leap year.");
    }

    public static boolean isLeapYear(int year02) {
        if (year02 % 4 == 0) {
            if (year02 % 100 != 0 || year02 % 400 == 0) {
                return true;
            }
        }
        return false;
    }
    public static boolean checkYear(int year03) {
        return year03 >= 1000 && year03 <= 3000;
    }
}
