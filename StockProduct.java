import java.util.*;
public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] productList = new Product[4];
		Product[] proUnit = new Product[4];
		Product[] proPrice = new Product[4];
		for (int i = 0; i < productList.length; i++) {
			productList[i] = new Product();
			System.out.print("Input product Id    :");
			productList[i].setId(scan.nextLine());
			System.out.print("Input product Unit  : ");
			proUnit[i].setUnit(scan.nextInt());
			scan.nextLine();
			System.out.print("Input product Price : ");
			proPrice[i].setPrice(scan.nextDouble());
			scan.nextLine();
			System.out.println();
			
		}
		Line();
		for(Product Pid : productList) {
			System.out.printf("\nProduct ID %s, Total price = %.2f baht.", Pid.getId() , Pid.calculate());
		}
		Line();
	}
	public static void Line() {
		for (int i = 1; i < 50; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
