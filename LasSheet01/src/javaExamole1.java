import java.util.*;
import java.text.*;
public class javaExamole1 
{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		// แสดงผลชื่อสิ่งค้า
		DecimalFormat frm = new DecimalFormat("#,###.00");
		
		System.out.print("Input product name   : ");
		String productName = input.nextLine();
		// แสดงและรับข้อมูลสิ่งค้า
		System.out.print("Input product init   : ");
		int productUnit = input.nextInt();
		System.out.print("Input price per unit : ");
		float productPrice = input.nextFloat();		
		System.out.println();
		float totalPriceofPoroduct = productUnit*productPrice;
		System.out.println("Total Price is "+frm.format(totalPriceofPoroduct)+" baht.");
		float totalwithVat = totalPriceofPoroduct + (totalPriceofPoroduct*7/100);
		System.out.println("Add VAT 7%  is "+frm.format(totalwithVat)+" baht.");
		System.out.println();
		
		String frmtotalwithVat = String.format("%,.2f",totalwithVat);
		System.out.println("Output using String.format");
		System.out.println("Add VAT 7%  is "+frmtotalwithVat+" baht.");
		System.out.println("Output using printf");
		System.out.printf("Add VAT 7%% is %,.2f" , totalwithVat);
		input.close();
	}
}
