package ClassWork.solid;

import java.util.List;

public class Shelf {

    List<IProd> books;

    private IProd prod;

    public void setProd(IProd prod) {
        this.prod = prod;
    }

    public void addProduct(IProd prod) {

        this.prod = prod;

        if(prod.getClass() == Book.class) {
            System.out.println("TRUE");
            books.add(prod);
            System.out.println(books);
        }
    }

    public static void main(String[] args) {

        Shelf myShelf = new Shelf();
        myShelf.addProduct(new Book("1984", "Or"));

    }
}
