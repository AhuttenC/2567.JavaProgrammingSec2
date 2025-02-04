import java.util.*;
public class StockProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] productList = new Product[4];
        for (int i = 0; i < 4; i++){
            System.out.print("Input  product Id    : ");
            String id = scanner.nextLine();

            System.out.print("Input product Unit   : ");
            int unit = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Input product Price  : ");
            double price = scanner.nextDouble();
            scanner.nextLine();
            System.out.println();
            productList[i] = new Product(id, unit, price);
        }
        Line();
        double totalValue = 0;
        for (Product product : productList) {
            double totalPrice = product.calculate();
            System.out.printf("\nProduct ID : %s, Total price = %.2f baht.", product.getId(), totalPrice);
            totalValue += totalPrice;
        }
        System.out.println();
        Line();
        System.out.printf("\nTotal price of all products is %.2f baht.\n", totalValue);
        scanner.close();
    }
    public static void Line(){
        for (int i = 0; i < 50; i++){
            System.out.print('-');
        }
    }
}
