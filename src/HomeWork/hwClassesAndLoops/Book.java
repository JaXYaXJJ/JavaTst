package HomeWork.hwClassesAndLoops;

public class Book {

    String name;
    String author;
    int numberOfPages;

    public Book (String bookName, String authorName, int totalPages) {

        this.name = bookName;
        this.author = authorName;
        this.numberOfPages = totalPages;
    }

    public String getName() {
        return this.name;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    @Override
    public String toString() {
        return "Your book: " + this.name +
                "\nWrite by: " + this.author +
                "\nTotal book pages: " + this.numberOfPages;
    }
}
