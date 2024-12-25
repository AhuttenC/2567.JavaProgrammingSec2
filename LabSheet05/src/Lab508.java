import javax.swing.JOptionPane;
public class Lab508 {
	public static void main(String[] args) {
		int[] nums = { 25, 78, 41, 22, 36, 85, 37 };
		int inputindex;
		inputindex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array"));
		while (checklndex(nums, inputindex)!=true) {
			
			inputindex = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again"));
		}
		
	}
	public static boolean checklndex(int[] nums01 , int index01) {
		
		if (index01 >= 0 && index01.length > index01) { }
	}
}
