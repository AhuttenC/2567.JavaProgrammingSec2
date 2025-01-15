import java.util.*;
public class TestEmployeesInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		Employee emp1 = new Employee();
		Employee emp2 = new Employee();
		
		System.out.println("Enter details for Employee 1 : ");
		System.out.print("Name: ");
		String empName1 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHoursWorked1 = scan.nextInt();
		System.out.print("Hours Rate: ");
		double empHoursRate1 = scan.nextDouble();
		
		emp1.setEmployeeDetails(empName1, empHoursWorked1, empHoursRate1);
		line('-');
		emp1.displayEmployeeDetails();
		line('*');
		
		scan.nextLine(); //**********//
		
		System.out.println("Enter details for Employee 2 : ");
		System.out.print("Name: ");
		String empName2 = scan.nextLine();
		System.out.print("Hours Worked: ");
		int empHoursWorked2 = scan.nextInt();
		System.out.print("Hours Rate: ");
		double empHoursRate2 = scan.nextDouble();
		
		emp2.setEmployeeDetails(empName2, empHoursWorked2, empHoursRate2);
		line('-');
		emp2.displayEmployeeDetails();
		line('*');
		
		scan.close();
	}
	public static void line(char symbol) {
		for (int i = 1; i < 50; i++) {
			System.out.print(symbol);
		}
		System.out.println();
	}
}
