import java.util.*;
public class Lab304 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Full Name: ");
        String fullName = scan.nextLine();
        int spaceIndex = fullName.indexOf(" ");
        if (spaceIndex <= 0 ){
            System.out.print("Incorrect Name");
        }
        else {
            String firstName = fullName.substring(0 , spaceIndex).toUpperCase();
            String lastName = fullName.substring(spaceIndex +1).toLowerCase();
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        }
    }
}
