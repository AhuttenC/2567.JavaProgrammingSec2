import javax.swing.*;
public class Lab303_1 {
    public static void main(String[] args) {
        String sentence;
        int spacehar = 0;
        int word = 1;
        sentence = JOptionPane.showInputDialog("Input a sentence: ");
        while (true){
            if (sentence.endsWith(".")){ break; }
            sentence = JOptionPane.showInputDialog("Input a sentence, again: ");
        }
        for (int i = 0; i < sentence.length(); i++) {
            if(sentence.charAt(i)==' '){
                spacehar++;
                word++;
            }
        }
        JOptionPane.showMessageDialog(null , "This sentence has "+spacehar+" spacehar."+
                "\nThis sentence has "+word+" word.");
    }
}
