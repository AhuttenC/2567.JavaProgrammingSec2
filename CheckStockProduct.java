import java.util.*;
public class CheckStockProduct {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many product list stock: ");
        int manyProduct = scanner.nextInt();
        scanner.nextLine();
        Product[] productList = new Product[manyProduct];
        for (int i = 0; i < manyProduct; i++){
            System.out.print("Input  product Id    : ");
            String id = scanner.nextLine();

            System.out.print("Input product Unit   : ");
            int unit = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            productList[i] = new Product(id, unit, 0);
        }
        Line();
        System.out.println("List of product in 'LOW' status");
        Line();
        for (Product product : productList) {
            if (product.getUnit() <= 5){
                System.out.println(">> "+product.getId()+" has "+ product.getUnit()+" units");
            }
        }
        Line();
        System.out.println("List of product in 'NORMAL' status");
        Line();
        for (Product product : productList) {
            if (product.getUnit() > 5 && product.getUnit() < 50){
                System.out.println(">> "+product.getId()+" has "+ product.getUnit()+" units");
            }
        }
        Line();
        System.out.println("List of product in 'HIGH' status");
        Line();
        for (Product product : productList) {
            if (product.getUnit() >= 50){
                System.out.println(">> "+product.getId()+" has "+ product.getUnit()+" units");
            }
        }
    }
    public static void Line(){
        for (int i = 0; i < 50; i++){
            System.out.print('-');
        }
        System.out.println();
    }
}
