import javax.swing.JOptionPane;
public class JavExample2
{
    public static void main(String[] args)
    {
        String minute;
        minute = JOptionPane.showInputDialog("Input Time Parking (minute):");
        int minuteInt = Integer.parseInt(minute);
        int timeHour = minuteInt/60;
        int timeMinute2 = minuteInt%60;
        double moneyMInute = timeMinute2*0.25;
        double moneyHour = timeHour*50;
        JOptionPane.showMessageDialog(null,"You parking "+ timeHour + " Hour" + timeMinute2 +" Minute.\n" +
                "Amount to be paid is "+(moneyMInute+moneyHour)+" baht.");
    }
}
