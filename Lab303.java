import java.util.*;
public class Lab303 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int spacehar = 0;
        int word = 1;

        System.out.print("Input a sentence : ");
        String sentence = scan.nextLine();
        while (true) {
            if (sentence.endsWith(".")){ break; }
            System.out.print("Input a sentence, again : ");
            sentence = scan.nextLine();
        }
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)==' '){
                spacehar++;
                word++;
            }
        }
        System.out.println("This sentence has "+spacehar+" spacehar.");
        System.out.println("This sentence has "+word+" word.");
    }
}