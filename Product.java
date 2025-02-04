public class Product {
    private String productId;
    private int productUnit;
    private double productPrice;

    public Product(String pid, int proUnit, double proPrice) {
        this.productId = pid;
        this.productUnit = proUnit;
        this.productPrice = proPrice;
    }
    public String getId(){
        return this.productId;
    }
    public int getUnit(){
        return this.productUnit;
    }
    public double getPrice(){
        return this.productPrice;
    }
    public double calculate(){
        return productUnit * productPrice;
    }
}
