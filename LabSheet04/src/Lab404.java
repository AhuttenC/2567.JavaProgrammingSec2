import java.util.*;

import javax.swing.plaf.TabbedPaneUI;
public class Lab404 {
	public static void main(String[] args) {
		inputStudent();
	}
	public static void inputStudent() {
		Scanner scanner = new Scanner(System.in);
		String studentID, subjectCode;
		boolean isStudentIDValid, isSubjectCodeValid;
		while (true) {
			System.out.print("Enter student ID (10 digits): ");
			studentID = scanner.nextLine();
			System.out.print("Enter subject code (7 digits): ");
			subjectCode = scanner.nextLine();
			isStudentIDValid = isLength(studentID, 10);
			isSubjectCodeValid = isLength(subjectCode, 7);
			
			if (isStudentIDValid && isSubjectCodeValid) {
				boolean isITStudent = isITStudent(studentID);
				boolean isITSubject = isITSubject(subjectCode);
				
				displayData (isITStudent,isITSubject,studentID);
				break;
			}
			else {
				System.out.print("");
			}
		}
		
	}
	public static boolean isLength(String input,int len) {
		return input.length() == len;
	}
	public static boolean isITStudent(String input02) {
		return (input02.startsWith("1",2) || input02.startsWith("311",3));
	}
	public static boolean isITSubject(String input03) {
		return (input03.startsWith("21",0) || input03.startsWith("1",4));
	}
	public static void displayData(boolean isITStudent04 , boolean isITSubject04 , String studentID04) {
		String student = "";
		String studentError = "";
		String studentTandT = "";
		
		if (isITStudent04 != true) {
			student = "is not";
		}
		if (isITSubject04 != true){
			studentError = "not";
		}
		else { 
			studentTandT = "and";
		}
		System.out.print("Student ID: "+studentID04+""+student+" 1st year student in IT "+studentTandT+
				"\n"+studentError+"Enroll in courses for Year 1");
	}
}
