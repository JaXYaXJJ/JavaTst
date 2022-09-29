package Static;

public class Shirt extends Product {

    private String size;

    public Shirt(double price, String color, String brand, String size) {
        super(price, color, brand);
        this.size = size;
    }
}
