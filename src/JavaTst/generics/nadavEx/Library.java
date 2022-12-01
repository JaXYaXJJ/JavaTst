package JavaTst.generics.nadavEx;

import java.util.ArrayList;
import java.util.List;

public class Library<T extends Book> {
    private List<T> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public boolean addBook(T book) {
        return this.books.add(book);
    }

    public T getByTittle(String title) {
        for(T book : books) {
            if(book.getTitle().equals(title))
                return book;
        }
        return null;
    }
}
