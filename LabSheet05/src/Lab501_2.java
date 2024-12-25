import javax.swing.JOptionPane;
public class Lab501_2 {
	public static void main(String[] args) {
		boolean deptWasFound = false;
		String[] deptName = {"Accounting","HR","Sales","Innovation"};
		
		String departmentName = JOptionPane.showInputDialog("Enter a dapartment name");
		for (int i = 0; i <deptName.length;i++) {
			if (departmentName.equalsIgnoreCase(deptName[i])) {
				deptWasFound = true;
			}
		}
		if (deptWasFound) {
			JOptionPane.showMessageDialog(null, departmentName + " was found in the list");
		}
		else {
			JOptionPane.showMessageDialog(null, departmentName + " was not found in the list");
		}
	}
}
