package ClassWork.solid;

public class Book implements IProd {
    private String bookName;
    private String author;

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void readReviews() {
    }

    @Override
    public String getSummary() {

        return null;
    }
}
