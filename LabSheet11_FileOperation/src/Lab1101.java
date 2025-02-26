import java.util.*;
import java.io.*;
public class Lab1101 {
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException{
		System.out.print("Input Saection: ");
		int section = input.nextInt();
		
		prinHeader(section);
		displayStudentList(section);
		
	}
	
	public static void prinHeader(int section01) {
		Line();
		System.out.println("\t\tList of Data for Section "+ section01);
		Line();
	}
	public static void displayStudentList(int section02) throws IOException{
		try(BufferedReader readFile = new BufferedReader(new FileReader ("src//txtFile//List107.txt"))) {
			String temp = "";
			while((temp = readFile.readLine()) != null) {
				String[] data = temp.split("\t");
				
				if (data.length < 6) continue;
				int studentSection = Integer.parseInt(data[3]);				
				
				if (studentSection == section02) {
					Double midterm = Double.parseDouble(data[4]);
					Double finalScore = Double.parseDouble(data[5]);
					System.out.printf("%s %s\t%.2f\t%.2f %s %n", data[0], data[2], midterm, finalScore, determineResult(midterm,finalScore));
				}
			}
		}
	}
	
	public static String determineResult(double mid, double fin) {
		return (mid + fin) <= 40 ? "Fail" : "Pass";
	}
	
	public static void Line() {
		for(int i = 1; i < 120; i++) {
			System.out.print("*");
		}
		System.out.println();
	}
}
