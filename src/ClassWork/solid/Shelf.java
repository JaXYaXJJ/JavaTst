package ClassWork.solid;

import java.util.ArrayList;
import java.util.List;

public class Shelf {

    List<IProd> books = new ArrayList<IProd>();
    List<IProd> dvds = new ArrayList<IProd>();
    List<IProd> vinyls = new ArrayList<>();

    private IProd prod;

    public void setProd(IProd prod) {
        this.prod = prod;
    }

    public void addProduct(IProd prod) {

        this.prod = prod;

        if(prod.getClass() == Book.class) {
            books.add(prod);
        } else if (prod.getClass() == DVD.class) {
            dvds.add(prod);
        } else {
            vinyls.add(prod);
        }
    }

    public static void main(String[] args) {

        Shelf myShelf = new Shelf();
        myShelf.addProduct(new Book("1984", "George Orwell"));
        myShelf.addProduct(new Book("The Count of Monte Cristo", "Alexandre Dumas"));
        myShelf.addProduct(new DVD("Pinocchio", "Guillermo del Toro"));
        myShelf.addProduct(new DVD("The Untouchables", "Brian De Palma"));
        myShelf.addProduct(new Vinyl("Nevermind", "Nirvana"));
        System.out.println(myShelf.vinyls);

    }
}
