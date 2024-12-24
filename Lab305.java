import java.util.*;
public class Lab305 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Input some sentence : ");
        String index = scan.nextLine();
        while (true){
            if (index.endsWith(".")){ break; }
            System.out.print("The sentence end must end with full stop point : ");
            index = scan.nextLine();
        }
        int spaceIndex = index.indexOf(" ");
        System.out.println();
        // System.out.print(sentence.replace(" ","\n"));
        for (int i = 0; i < index.length(); i++){
            if (index.charAt(i) == ' '){ System.out.println(); continue; }
            System.out.print(index.charAt(i));
        }
    }
}
