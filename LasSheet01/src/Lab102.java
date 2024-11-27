import java.util.*;
import java.text.*;
public class Lab102 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.print("Input the number of minutes :");
		int minutes = input.nextInt();
		int minutesHour = minutes/60;
		int minutesDay  = minutesHour/24;
		int Year = minutesDay/365;
		int Dey = minutesDay%365;
		System.out.print(minutes+" minutes is approximately "+Year+" year and "+Dey+" days");
	}

}
