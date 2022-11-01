package ClassWork.exTwo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    private Map<Integer, Book> books;
    protected final static int MAX_BOOKS = 7;

    public Library() {

        books = new HashMap<>();
    }

    public boolean addBook(Book book) {

        int bookId = book.getId();
        if (books.containsKey(bookId))
            return false;

        books.put(bookId, book);
        return true;
    }

    public boolean removeBook(int bookId) {

        return books.remove(bookId) == null ? false : true;
    }

    public Book loanBook(int bookId) {

        if (!books.containsKey(bookId) || !books.get(bookId).isAvailable())
            return null;

        books.get(bookId).setAvailable(false);
        return books.get(bookId);
    }

    public boolean returnBook(int bookId) {

        if (books.containsKey(bookId)) {
            books.get(bookId).setAvailable(true);
            return true;
        }

        return false;
    }

    public List<Book> getBooksList() {

        return new ArrayList<>(books.values());
    }
}
