import java.util.*;
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
                System.out.print("Student id: " + studentID);
                displayData (isITStudent,isITSubject);
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
        return (input02.startsWith("21") && input02.startsWith("1",2) && input02.startsWith("311",3));
    }
    public static boolean isITSubject(String input03) {
        return (input03.startsWith("21") && input03.startsWith("1",4));
    }
    public static void displayData(boolean isITStudent04 , boolean isITSubject04) {
        String student = (isITStudent04 == true) ? " " : " is not ";
        String studentError = (isITSubject04 == true) ? "Enroll" : "not enroll";
        System.out.print(student+"1st year student in IT\n" + studentError +
                " in courses for Year 1");
    }
}
