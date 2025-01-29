import java.util.*;
public class TeatStudent {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("How many student in classroom : ");
		int numberrofSudent = scan.nextInt();
		scan.nextLine(); //**** ต้องทำถ้าเกิดใส่ nextInt และ nextDaubol ****
		System.out.println();
		
		Student[] students = new Student[numberrofSudent];
		for (int i = 0; i < numberrofSudent; i++) {
			students[i] = new Student();
			System.out.println("INPUT INFORMATION OF STUDENT "+ (i + 1 ));
			Line();
			System.out.print("Input student name: ");
			students[i].setName(scan.nextLine()); // String เท่านั้น
				System.out.print("Input student score : ");
				int score = scan.nextInt();
				scan.nextLine();
				while(true) {
					if (students[i].checkScore() == true){ 
						break; }
				System.out.print("Input score, again: ");
				score = scan.nextInt();
				scan.nextLine();
				students[i].setScore(score);
			}
		}
		System.out.println("\nLIST OF PASS STUDENT (>= 50):");
		Line();
		for (Student student : students) {
			if(student.isPass()) {
				System.out.println(">> "+student.getName()+" ("+student.getScore()+") ");
				System.out.print("get grsde "+ findGrade(numberrofSudent));
			}
		}
		scan.close();
	}
	public static String findGrade(int score) {
		if (score <= 49) { return "F"; }
		else if (score <= 54) { return "D"; }
		else if (score <= 59) { return "D+"; }
		else if (score <= 64) { return "C"; }
		else if (score <= 69) { return "C+"; }
		else if (score <= 74) { return "B"; }
		else if (score <= 79) { return "B+"; }
		else { return "A"; }
	}
	public static void Line() {
		for (int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
