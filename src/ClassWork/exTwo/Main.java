package ClassWork.exTwo;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

// manual .add
//        library.addBook(new Book(1, "BookOne", true));
//        library.addBook(new Book(2, "BookTwo", true));
//        library.addBook(new Book(3, "BookThree", true));

//loop .add
        for (int i = 0; i < Library.MAX_BOOKS; i++)
            library.addBook(new Book(i, "Book_" + i, true));

        System.out.println(library.getBooksList());
    }
}
