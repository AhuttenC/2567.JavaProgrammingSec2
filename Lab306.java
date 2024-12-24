import java.util.*;
public class Lab306 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Message : ");
        String message = scan.nextLine();
        String lowerMessage = message.toLowerCase();
        int count = 0;
        int messageIndex = lowerMessage.indexOf("nichi");
        while (messageIndex != -1){
            count++;
            messageIndex = lowerMessage.indexOf("nichi", messageIndex + 1);
        }
        if (0 <= lowerMessage.indexOf("nichi")){
            System.out.print("Nichi is "+count+" sentence");
        }
        else {
            System.out.print(message);
        }
    }
}
