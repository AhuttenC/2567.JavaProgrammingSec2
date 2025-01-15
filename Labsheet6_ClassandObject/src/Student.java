import java.util.Iterator;

public class Student {
	
	private String name;
	private double[] scores;
	
	public void setStudentDetails (String stdName, double[] stdScores) {
		
		name = stdName;
		scores = stdScores;
		
	}
	public double calculatAverageScore() {
		double total = 0.0;
		for (double _scores : scores) {
			total += _scores;
		}
		return total/scores.length;
	}
	public String getGrade() {
		double average = calculatAverageScore();
		if (average >= 90) { return "A"; }
		else if (average >= 80) { return "B"; }
		else if (average >= 70) { return "C"; }
		else if (average >= 60) { return "D"; }
		else { return "F"; }
	}
	public void displayStudentDetails() {
		System.out.println("Name: "+ name);
		System.out.println("Scores: ");
		for (double _scores : scores) {
			System.out.print(_scores+" ");
			
		}
		System.out.println("\nAverage Score: "+ calculatAverageScore());
		System.out.println("Grade: "+getGrade());
	}
}
