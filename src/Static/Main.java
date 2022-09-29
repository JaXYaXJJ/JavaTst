package Static;

public class Main {

    public static void main(String[] args) {

//        Product newProduct = new Product(199,"Black", "Nike");

        Shirt shirt = new Shirt(55, "Red", "Adidas", "Medium");

        shirt.color = "Blue"; //because we are change the permission in Product.java
        // from "private" to "protected" String color;
    }
}
