
public class TestStudents {

	public static void main(String[] args) {
		
	    Student student1 = new Student();
		Student student2 = new Student();
		
		student1.setStudentDetails("Siriyakorn", new double[] {85.0,78.0,92.0});
		student2.setStudentDetails("Sumsoo", new double[] {68.0,66.5});
		
		System.out.println("Student 1 detils: ");
		student1.displayStudentDetails();
		System.out.println("\nStudent 1 detils: ");
		student2.displayStudentDetails();
		
	}
}
